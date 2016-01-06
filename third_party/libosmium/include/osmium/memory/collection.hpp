#ifndef OSMIUM_MEMORY_COLLECTION_HPP
#define OSMIUM_MEMORY_COLLECTION_HPP

/*

This file is part of Osmium (http://osmcode.org/libosmium).

Copyright 2013-2015 Jochen Topf <jochen@topf.org> and others (see README).

Boost Software License - Version 1.0 - August 17th, 2003

Permission is hereby granted, free of charge, to any person or organization
obtaining a copy of the software and accompanying documentation covered by
this license (the "Software") to use, reproduce, display, distribute,
execute, and transmit the Software, and to prepare derivative works of the
Software, and to permit third-parties to whom the Software is furnished to
do so, all subject to the following:

The copyright notices in the Software and this entire statement, including
the above license grant, this restriction and the following disclaimer,
must be included in all copies of the Software, in whole or in part, and
all derivative works of the Software, unless such copies or derivative
works are solely in the form of machine-executable object code generated by
a source language processor.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE, TITLE AND NON-INFRINGEMENT. IN NO EVENT
SHALL THE COPYRIGHT HOLDERS OR ANYONE DISTRIBUTING THE SOFTWARE BE LIABLE
FOR ANY DAMAGES OR OTHER LIABILITY, WHETHER IN CONTRACT, TORT OR OTHERWISE,
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
DEALINGS IN THE SOFTWARE.

*/

#include <iterator>
#include <iosfwd>
#include <type_traits>

#include <osmium/memory/item.hpp>

namespace osmium {

    namespace memory {

        template <typename TMember>
        class CollectionIterator : public std::iterator<std::forward_iterator_tag, TMember> {

            // This data_type is either 'unsigned char*' or 'const unsigned char*' depending
            // on whether TMember is const. This allows this class to be used as an iterator and
            // as a const_iterator.
            typedef typename std::conditional<std::is_const<TMember>::value, const unsigned char*, unsigned char*>::type data_type;

            data_type m_data;

        public:

            CollectionIterator() noexcept :
                m_data(nullptr) {
            }

            explicit CollectionIterator(data_type data) noexcept :
                m_data(data) {
            }

            CollectionIterator<TMember>& operator++() {
                m_data = reinterpret_cast<TMember*>(m_data)->next();
                return *static_cast<CollectionIterator<TMember>*>(this);
            }

            CollectionIterator<TMember> operator++(int) {
                CollectionIterator<TMember> tmp(*this);
                operator++();
                return tmp;
            }

            bool operator==(const CollectionIterator<TMember>& rhs) const noexcept {
                return m_data == rhs.m_data;
            }

            bool operator!=(const CollectionIterator<TMember>& rhs) const noexcept {
                return m_data != rhs.m_data;
            }

            unsigned char* data() const noexcept {
                return m_data;
            }

            TMember& operator*() const {
                return *reinterpret_cast<TMember*>(m_data);
            }

            TMember* operator->() const {
                return reinterpret_cast<TMember*>(m_data);
            }

            template <typename TChar, typename TTraits>
            friend std::basic_ostream<TChar, TTraits>& operator<<(std::basic_ostream<TChar, TTraits>& out, const CollectionIterator<TMember>& iter) {
                return out << static_cast<const void*>(iter.m_data);
            }

        }; // class CollectionIterator

        template <typename TMember, osmium::item_type TCollectionItemType>
        class Collection : public Item {

        public:

            typedef CollectionIterator<TMember> iterator;
            typedef CollectionIterator<const TMember> const_iterator;
            typedef TMember value_type;

            static constexpr osmium::item_type itemtype = TCollectionItemType;

            Collection() :
                Item(sizeof(Collection<TMember, TCollectionItemType>), TCollectionItemType) {
            }

            bool empty() const {
                return sizeof(Collection<TMember, TCollectionItemType>) == byte_size();
            }

            iterator begin() {
                return iterator(data() + sizeof(Collection<TMember, TCollectionItemType>));
            }

            iterator end() {
                return iterator(data() + byte_size());
            }

            const_iterator cbegin() const {
                return const_iterator(data() + sizeof(Collection<TMember, TCollectionItemType>));
            }

            const_iterator cend() const {
                return const_iterator(data() + byte_size());
            }

            const_iterator begin() const {
                return cbegin();
            }

            const_iterator end() const {
                return cend();
            }

        }; // class Collection

    } // namespace memory

} // namespace osmium

#endif // OSMIUM_MEMORY_COLLECTION_HPP
