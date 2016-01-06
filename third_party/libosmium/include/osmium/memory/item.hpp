#ifndef OSMIUM_MEMORY_ITEM_HPP
#define OSMIUM_MEMORY_ITEM_HPP

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

#include <cstdint>
#include <type_traits>

namespace osmium {

    // forward declaration, see osmium/osm/item_type.hpp for declaration
    enum class item_type : uint16_t;

    namespace builder {
        class Builder;
    } // namespace builder

    namespace memory {

        typedef uint32_t item_size_type;

        // align datastructures to this many bytes
        constexpr item_size_type align_bytes = 8;

        template <typename T>
        inline T padded_length(T length) noexcept {
            static_assert(std::is_integral<T>::value && std::is_unsigned<T>::value, "Template parameter must be unsigned integral type");
            return (length + align_bytes - 1) & ~(align_bytes - 1);
        }

        /**
         * @brief Namespace for Osmium internal use
         */
        namespace detail {

            /**
            * This class contains only a helper method used in several
            * other classes.
            */
            class ItemHelper {

            protected:

                ItemHelper() = default;

                ~ItemHelper() = default;

                ItemHelper(const ItemHelper&) = default;
                ItemHelper(ItemHelper&&) = default;

                ItemHelper& operator=(const ItemHelper&) = default;
                ItemHelper& operator=(ItemHelper&&) = default;

            public:

                unsigned char* data() noexcept {
                    return reinterpret_cast<unsigned char*>(this);
                }

                const unsigned char* data() const noexcept {
                    return reinterpret_cast<const unsigned char*>(this);
                }

            }; // class ItemHelper

        } // namespace detail

        class Item : public osmium::memory::detail::ItemHelper {

            item_size_type m_size;
            item_type m_type;
            uint16_t m_removed : 1;
            uint16_t m_padding : 15;

            template <typename TMember>
            friend class CollectionIterator;

            template <typename TMember>
            friend class ItemIterator;

            friend class osmium::builder::Builder;

            Item& add_size(const item_size_type size) noexcept {
                m_size += size;
                return *this;
            }

        protected:

            explicit Item(item_size_type size = 0, item_type type = item_type()) noexcept :
                m_size(size),
                m_type(type),
                m_removed(false),
                m_padding(0) {
            }

            Item(const Item&) = delete;
            Item(Item&&) = delete;

            Item& operator=(const Item&) = delete;
            Item& operator=(Item&&) = delete;

            Item& set_type(const item_type item_type) noexcept {
                m_type = item_type;
                return *this;
            }

        public:

            unsigned char* next() noexcept {
                return data() + padded_size();
            }

            const unsigned char* next() const noexcept {
                return data() + padded_size();
            }

            item_size_type byte_size() const noexcept {
                return m_size;
            }

            item_size_type padded_size() const {
                return padded_length(m_size);
            }

            item_type type() const noexcept {
                return m_type;
            }

            bool removed() const noexcept {
                return m_removed;
            }

            void set_removed(bool removed) noexcept {
                m_removed = removed;
            }

        }; // class Item

        static_assert(sizeof(Item) == 8, "Class osmium::Item has wrong size!");
        static_assert(sizeof(Item) % align_bytes == 0, "Class osmium::Item has wrong size to be aligned properly!");

    } // namespace memory

} // namespace osmium

#endif // OSMIUM_MEMORY_ITEM_HPP
