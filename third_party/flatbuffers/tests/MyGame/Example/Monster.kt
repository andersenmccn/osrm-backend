// automatically generated by the FlatBuffers compiler, do not modify

package MyGame.Example

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

/**
 * an example documentation comment: monster object
 */
@Suppress("unused")
@ExperimentalUnsignedTypes
class Monster : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : Monster {
        __init(_i, _bb)
        return this
    }
    val pos : MyGame.Example.Vec3? get() = pos(MyGame.Example.Vec3())
    fun pos(obj: MyGame.Example.Vec3) : MyGame.Example.Vec3? {
        val o = __offset(4)
        return if (o != 0) {
            obj.__assign(o + bb_pos, bb)
        } else {
            null
        }
    }
    val mana : Short
        get() {
            val o = __offset(6)
            return if(o != 0) bb.getShort(o + bb_pos) else 150
        }
    fun mutateMana(mana: Short) : Boolean {
        val o = __offset(6)
        return if (o != 0) {
            bb.putShort(o + bb_pos, mana)
            true
        } else {
            false
        }
    }
    val hp : Short
        get() {
            val o = __offset(8)
            return if(o != 0) bb.getShort(o + bb_pos) else 100
        }
    fun mutateHp(hp: Short) : Boolean {
        val o = __offset(8)
        return if (o != 0) {
            bb.putShort(o + bb_pos, hp)
            true
        } else {
            false
        }
    }
    val name : String?
        get() {
            val o = __offset(10)
            return if (o != 0) __string(o + bb_pos) else null
        }
    val nameAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(10, 1)
    fun nameInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 10, 1)
    fun inventory(j: Int) : UByte {
        val o = __offset(14)
        return if (o != 0) {
            bb.get(__vector(o) + j * 1).toUByte()
        } else {
            0u
        }
    }
    val inventoryLength : Int
        get() {
            val o = __offset(14); return if (o != 0) __vector_len(o) else 0
        }
    val inventoryAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(14, 1)
    fun inventoryInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 14, 1)
    fun mutateInventory(j: Int, inventory: UByte) : Boolean {
        val o = __offset(14)
        return if (o != 0) {
            bb.put(__vector(o) + j * 1, inventory.toByte())
            true
        } else {
            false
        }
    }
    val color : UByte
        get() {
            val o = __offset(16)
            return if(o != 0) bb.get(o + bb_pos).toUByte() else 8u
        }
    fun mutateColor(color: UByte) : Boolean {
        val o = __offset(16)
        return if (o != 0) {
            bb.put(o + bb_pos, color.toByte())
            true
        } else {
            false
        }
    }
    val testType : UByte
        get() {
            val o = __offset(18)
            return if(o != 0) bb.get(o + bb_pos).toUByte() else 0u
        }
    fun mutateTestType(testType: UByte) : Boolean {
        val o = __offset(18)
        return if (o != 0) {
            bb.put(o + bb_pos, testType.toByte())
            true
        } else {
            false
        }
    }
    fun test(obj: Table) : Table? {
        val o = __offset(20); return if (o != 0) __union(obj, o) else null
    }
    fun test4(j: Int) : MyGame.Example.Test? = test4(MyGame.Example.Test(), j)
    fun test4(obj: MyGame.Example.Test, j: Int) : MyGame.Example.Test? {
        val o = __offset(22)
        return if (o != 0) {
            obj.__assign(__vector(o) + j * 4, bb)
        } else {
            null
        }
    }
    val test4Length : Int
        get() {
            val o = __offset(22); return if (o != 0) __vector_len(o) else 0
        }
    fun testarrayofstring(j: Int) : String? {
        val o = __offset(24)
        return if (o != 0) {
            __string(__vector(o) + j * 4)
        } else {
            null
        }
    }
    val testarrayofstringLength : Int
        get() {
            val o = __offset(24); return if (o != 0) __vector_len(o) else 0
        }
    /**
     * an example documentation comment: this will end up in the generated code
     * multiline too
     */
    fun testarrayoftables(j: Int) : MyGame.Example.Monster? = testarrayoftables(MyGame.Example.Monster(), j)
    fun testarrayoftables(obj: MyGame.Example.Monster, j: Int) : MyGame.Example.Monster? {
        val o = __offset(26)
        return if (o != 0) {
            obj.__assign(__indirect(__vector(o) + j * 4), bb)
        } else {
            null
        }
    }
    val testarrayoftablesLength : Int
        get() {
            val o = __offset(26); return if (o != 0) __vector_len(o) else 0
        }
    fun testarrayoftablesByKey(key: String) : MyGame.Example.Monster? {
        val o = __offset(26)
        return if (o != 0) {
            MyGame.Example.Monster.__lookup_by_key(null, __vector(o), key, bb)
        } else {
            null
        }
    }
    fun testarrayoftablesByKey(obj: MyGame.Example.Monster, key: String) : MyGame.Example.Monster? {
        val o = __offset(26)
        return if (o != 0) {
            MyGame.Example.Monster.__lookup_by_key(obj, __vector(o), key, bb)
        } else {
            null
        }
    }
    val enemy : MyGame.Example.Monster? get() = enemy(MyGame.Example.Monster())
    fun enemy(obj: MyGame.Example.Monster) : MyGame.Example.Monster? {
        val o = __offset(28)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    fun testnestedflatbuffer(j: Int) : UByte {
        val o = __offset(30)
        return if (o != 0) {
            bb.get(__vector(o) + j * 1).toUByte()
        } else {
            0u
        }
    }
    val testnestedflatbufferLength : Int
        get() {
            val o = __offset(30); return if (o != 0) __vector_len(o) else 0
        }
    val testnestedflatbufferAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(30, 1)
    fun testnestedflatbufferInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 30, 1)
    val testnestedflatbufferAsMonster : MyGame.Example.Monster? get() = testnestedflatbufferAsMonster(MyGame.Example.Monster())
    fun testnestedflatbufferAsMonster(obj: MyGame.Example.Monster) : MyGame.Example.Monster? {
        val o = __offset(30)
        return if (o != 0) {
            obj.__assign(__indirect(__vector(o)), bb)
        } else {
            null
        }
    }
    fun mutateTestnestedflatbuffer(j: Int, testnestedflatbuffer: UByte) : Boolean {
        val o = __offset(30)
        return if (o != 0) {
            bb.put(__vector(o) + j * 1, testnestedflatbuffer.toByte())
            true
        } else {
            false
        }
    }
    val testempty : MyGame.Example.Stat? get() = testempty(MyGame.Example.Stat())
    fun testempty(obj: MyGame.Example.Stat) : MyGame.Example.Stat? {
        val o = __offset(32)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val testbool : Boolean
        get() {
            val o = __offset(34)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else false
        }
    fun mutateTestbool(testbool: Boolean) : Boolean {
        val o = __offset(34)
        return if (o != 0) {
            bb.put(o + bb_pos, (if(testbool) 1 else 0).toByte())
            true
        } else {
            false
        }
    }
    val testhashs32Fnv1 : Int
        get() {
            val o = __offset(36)
            return if(o != 0) bb.getInt(o + bb_pos) else 0
        }
    fun mutateTesthashs32Fnv1(testhashs32Fnv1: Int) : Boolean {
        val o = __offset(36)
        return if (o != 0) {
            bb.putInt(o + bb_pos, testhashs32Fnv1)
            true
        } else {
            false
        }
    }
    val testhashu32Fnv1 : UInt
        get() {
            val o = __offset(38)
            return if(o != 0) bb.getInt(o + bb_pos).toUInt() else 0u
        }
    fun mutateTesthashu32Fnv1(testhashu32Fnv1: UInt) : Boolean {
        val o = __offset(38)
        return if (o != 0) {
            bb.putInt(o + bb_pos, testhashu32Fnv1.toInt())
            true
        } else {
            false
        }
    }
    val testhashs64Fnv1 : Long
        get() {
            val o = __offset(40)
            return if(o != 0) bb.getLong(o + bb_pos) else 0L
        }
    fun mutateTesthashs64Fnv1(testhashs64Fnv1: Long) : Boolean {
        val o = __offset(40)
        return if (o != 0) {
            bb.putLong(o + bb_pos, testhashs64Fnv1)
            true
        } else {
            false
        }
    }
    val testhashu64Fnv1 : ULong
        get() {
            val o = __offset(42)
            return if(o != 0) bb.getLong(o + bb_pos).toULong() else 0UL
        }
    fun mutateTesthashu64Fnv1(testhashu64Fnv1: ULong) : Boolean {
        val o = __offset(42)
        return if (o != 0) {
            bb.putLong(o + bb_pos, testhashu64Fnv1.toLong())
            true
        } else {
            false
        }
    }
    val testhashs32Fnv1a : Int
        get() {
            val o = __offset(44)
            return if(o != 0) bb.getInt(o + bb_pos) else 0
        }
    fun mutateTesthashs32Fnv1a(testhashs32Fnv1a: Int) : Boolean {
        val o = __offset(44)
        return if (o != 0) {
            bb.putInt(o + bb_pos, testhashs32Fnv1a)
            true
        } else {
            false
        }
    }
    val testhashu32Fnv1a : UInt
        get() {
            val o = __offset(46)
            return if(o != 0) bb.getInt(o + bb_pos).toUInt() else 0u
        }
    fun mutateTesthashu32Fnv1a(testhashu32Fnv1a: UInt) : Boolean {
        val o = __offset(46)
        return if (o != 0) {
            bb.putInt(o + bb_pos, testhashu32Fnv1a.toInt())
            true
        } else {
            false
        }
    }
    val testhashs64Fnv1a : Long
        get() {
            val o = __offset(48)
            return if(o != 0) bb.getLong(o + bb_pos) else 0L
        }
    fun mutateTesthashs64Fnv1a(testhashs64Fnv1a: Long) : Boolean {
        val o = __offset(48)
        return if (o != 0) {
            bb.putLong(o + bb_pos, testhashs64Fnv1a)
            true
        } else {
            false
        }
    }
    val testhashu64Fnv1a : ULong
        get() {
            val o = __offset(50)
            return if(o != 0) bb.getLong(o + bb_pos).toULong() else 0UL
        }
    fun mutateTesthashu64Fnv1a(testhashu64Fnv1a: ULong) : Boolean {
        val o = __offset(50)
        return if (o != 0) {
            bb.putLong(o + bb_pos, testhashu64Fnv1a.toLong())
            true
        } else {
            false
        }
    }
    fun testarrayofbools(j: Int) : Boolean {
        val o = __offset(52)
        return if (o != 0) {
            0.toByte() != bb.get(__vector(o) + j * 1)
        } else {
            false
        }
    }
    val testarrayofboolsLength : Int
        get() {
            val o = __offset(52); return if (o != 0) __vector_len(o) else 0
        }
    val testarrayofboolsAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(52, 1)
    fun testarrayofboolsInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 52, 1)
    fun mutateTestarrayofbools(j: Int, testarrayofbools: Boolean) : Boolean {
        val o = __offset(52)
        return if (o != 0) {
            bb.put(__vector(o) + j * 1, (if(testarrayofbools) 1 else 0).toByte())
            true
        } else {
            false
        }
    }
    val testf : Float
        get() {
            val o = __offset(54)
            return if(o != 0) bb.getFloat(o + bb_pos) else 3.14159f
        }
    fun mutateTestf(testf: Float) : Boolean {
        val o = __offset(54)
        return if (o != 0) {
            bb.putFloat(o + bb_pos, testf)
            true
        } else {
            false
        }
    }
    val testf2 : Float
        get() {
            val o = __offset(56)
            return if(o != 0) bb.getFloat(o + bb_pos) else 3.0f
        }
    fun mutateTestf2(testf2: Float) : Boolean {
        val o = __offset(56)
        return if (o != 0) {
            bb.putFloat(o + bb_pos, testf2)
            true
        } else {
            false
        }
    }
    val testf3 : Float
        get() {
            val o = __offset(58)
            return if(o != 0) bb.getFloat(o + bb_pos) else 0.0f
        }
    fun mutateTestf3(testf3: Float) : Boolean {
        val o = __offset(58)
        return if (o != 0) {
            bb.putFloat(o + bb_pos, testf3)
            true
        } else {
            false
        }
    }
    fun testarrayofstring2(j: Int) : String? {
        val o = __offset(60)
        return if (o != 0) {
            __string(__vector(o) + j * 4)
        } else {
            null
        }
    }
    val testarrayofstring2Length : Int
        get() {
            val o = __offset(60); return if (o != 0) __vector_len(o) else 0
        }
    fun testarrayofsortedstruct(j: Int) : MyGame.Example.Ability? = testarrayofsortedstruct(MyGame.Example.Ability(), j)
    fun testarrayofsortedstruct(obj: MyGame.Example.Ability, j: Int) : MyGame.Example.Ability? {
        val o = __offset(62)
        return if (o != 0) {
            obj.__assign(__vector(o) + j * 8, bb)
        } else {
            null
        }
    }
    val testarrayofsortedstructLength : Int
        get() {
            val o = __offset(62); return if (o != 0) __vector_len(o) else 0
        }
    fun flex(j: Int) : UByte {
        val o = __offset(64)
        return if (o != 0) {
            bb.get(__vector(o) + j * 1).toUByte()
        } else {
            0u
        }
    }
    val flexLength : Int
        get() {
            val o = __offset(64); return if (o != 0) __vector_len(o) else 0
        }
    val flexAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(64, 1)
    fun flexInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 64, 1)
    fun mutateFlex(j: Int, flex: UByte) : Boolean {
        val o = __offset(64)
        return if (o != 0) {
            bb.put(__vector(o) + j * 1, flex.toByte())
            true
        } else {
            false
        }
    }
    fun test5(j: Int) : MyGame.Example.Test? = test5(MyGame.Example.Test(), j)
    fun test5(obj: MyGame.Example.Test, j: Int) : MyGame.Example.Test? {
        val o = __offset(66)
        return if (o != 0) {
            obj.__assign(__vector(o) + j * 4, bb)
        } else {
            null
        }
    }
    val test5Length : Int
        get() {
            val o = __offset(66); return if (o != 0) __vector_len(o) else 0
        }
    fun vectorOfLongs(j: Int) : Long {
        val o = __offset(68)
        return if (o != 0) {
            bb.getLong(__vector(o) + j * 8)
        } else {
            0
        }
    }
    val vectorOfLongsLength : Int
        get() {
            val o = __offset(68); return if (o != 0) __vector_len(o) else 0
        }
    val vectorOfLongsAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(68, 8)
    fun vectorOfLongsInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 68, 8)
    fun mutateVectorOfLongs(j: Int, vectorOfLongs: Long) : Boolean {
        val o = __offset(68)
        return if (o != 0) {
            bb.putLong(__vector(o) + j * 8, vectorOfLongs)
            true
        } else {
            false
        }
    }
    fun vectorOfDoubles(j: Int) : Double {
        val o = __offset(70)
        return if (o != 0) {
            bb.getDouble(__vector(o) + j * 8)
        } else {
            0.0
        }
    }
    val vectorOfDoublesLength : Int
        get() {
            val o = __offset(70); return if (o != 0) __vector_len(o) else 0
        }
    val vectorOfDoublesAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(70, 8)
    fun vectorOfDoublesInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 70, 8)
    fun mutateVectorOfDoubles(j: Int, vectorOfDoubles: Double) : Boolean {
        val o = __offset(70)
        return if (o != 0) {
            bb.putDouble(__vector(o) + j * 8, vectorOfDoubles)
            true
        } else {
            false
        }
    }
    val parentNamespaceTest : MyGame.InParentNamespace? get() = parentNamespaceTest(MyGame.InParentNamespace())
    fun parentNamespaceTest(obj: MyGame.InParentNamespace) : MyGame.InParentNamespace? {
        val o = __offset(72)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    fun vectorOfReferrables(j: Int) : MyGame.Example.Referrable? = vectorOfReferrables(MyGame.Example.Referrable(), j)
    fun vectorOfReferrables(obj: MyGame.Example.Referrable, j: Int) : MyGame.Example.Referrable? {
        val o = __offset(74)
        return if (o != 0) {
            obj.__assign(__indirect(__vector(o) + j * 4), bb)
        } else {
            null
        }
    }
    val vectorOfReferrablesLength : Int
        get() {
            val o = __offset(74); return if (o != 0) __vector_len(o) else 0
        }
    fun vectorOfReferrablesByKey(key: ULong) : MyGame.Example.Referrable? {
        val o = __offset(74)
        return if (o != 0) {
            MyGame.Example.Referrable.__lookup_by_key(null, __vector(o), key, bb)
        } else {
            null
        }
    }
    fun vectorOfReferrablesByKey(obj: MyGame.Example.Referrable, key: ULong) : MyGame.Example.Referrable? {
        val o = __offset(74)
        return if (o != 0) {
            MyGame.Example.Referrable.__lookup_by_key(obj, __vector(o), key, bb)
        } else {
            null
        }
    }
    val singleWeakReference : ULong
        get() {
            val o = __offset(76)
            return if(o != 0) bb.getLong(o + bb_pos).toULong() else 0UL
        }
    fun mutateSingleWeakReference(singleWeakReference: ULong) : Boolean {
        val o = __offset(76)
        return if (o != 0) {
            bb.putLong(o + bb_pos, singleWeakReference.toLong())
            true
        } else {
            false
        }
    }
    fun vectorOfWeakReferences(j: Int) : ULong {
        val o = __offset(78)
        return if (o != 0) {
            bb.getLong(__vector(o) + j * 8).toULong()
        } else {
            0uL
        }
    }
    val vectorOfWeakReferencesLength : Int
        get() {
            val o = __offset(78); return if (o != 0) __vector_len(o) else 0
        }
    val vectorOfWeakReferencesAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(78, 8)
    fun vectorOfWeakReferencesInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 78, 8)
    fun mutateVectorOfWeakReferences(j: Int, vectorOfWeakReferences: ULong) : Boolean {
        val o = __offset(78)
        return if (o != 0) {
            bb.putLong(__vector(o) + j * 8, vectorOfWeakReferences.toLong())
            true
        } else {
            false
        }
    }
    fun vectorOfStrongReferrables(j: Int) : MyGame.Example.Referrable? = vectorOfStrongReferrables(MyGame.Example.Referrable(), j)
    fun vectorOfStrongReferrables(obj: MyGame.Example.Referrable, j: Int) : MyGame.Example.Referrable? {
        val o = __offset(80)
        return if (o != 0) {
            obj.__assign(__indirect(__vector(o) + j * 4), bb)
        } else {
            null
        }
    }
    val vectorOfStrongReferrablesLength : Int
        get() {
            val o = __offset(80); return if (o != 0) __vector_len(o) else 0
        }
    fun vectorOfStrongReferrablesByKey(key: ULong) : MyGame.Example.Referrable? {
        val o = __offset(80)
        return if (o != 0) {
            MyGame.Example.Referrable.__lookup_by_key(null, __vector(o), key, bb)
        } else {
            null
        }
    }
    fun vectorOfStrongReferrablesByKey(obj: MyGame.Example.Referrable, key: ULong) : MyGame.Example.Referrable? {
        val o = __offset(80)
        return if (o != 0) {
            MyGame.Example.Referrable.__lookup_by_key(obj, __vector(o), key, bb)
        } else {
            null
        }
    }
    val coOwningReference : ULong
        get() {
            val o = __offset(82)
            return if(o != 0) bb.getLong(o + bb_pos).toULong() else 0UL
        }
    fun mutateCoOwningReference(coOwningReference: ULong) : Boolean {
        val o = __offset(82)
        return if (o != 0) {
            bb.putLong(o + bb_pos, coOwningReference.toLong())
            true
        } else {
            false
        }
    }
    fun vectorOfCoOwningReferences(j: Int) : ULong {
        val o = __offset(84)
        return if (o != 0) {
            bb.getLong(__vector(o) + j * 8).toULong()
        } else {
            0uL
        }
    }
    val vectorOfCoOwningReferencesLength : Int
        get() {
            val o = __offset(84); return if (o != 0) __vector_len(o) else 0
        }
    val vectorOfCoOwningReferencesAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(84, 8)
    fun vectorOfCoOwningReferencesInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 84, 8)
    fun mutateVectorOfCoOwningReferences(j: Int, vectorOfCoOwningReferences: ULong) : Boolean {
        val o = __offset(84)
        return if (o != 0) {
            bb.putLong(__vector(o) + j * 8, vectorOfCoOwningReferences.toLong())
            true
        } else {
            false
        }
    }
    val nonOwningReference : ULong
        get() {
            val o = __offset(86)
            return if(o != 0) bb.getLong(o + bb_pos).toULong() else 0UL
        }
    fun mutateNonOwningReference(nonOwningReference: ULong) : Boolean {
        val o = __offset(86)
        return if (o != 0) {
            bb.putLong(o + bb_pos, nonOwningReference.toLong())
            true
        } else {
            false
        }
    }
    fun vectorOfNonOwningReferences(j: Int) : ULong {
        val o = __offset(88)
        return if (o != 0) {
            bb.getLong(__vector(o) + j * 8).toULong()
        } else {
            0uL
        }
    }
    val vectorOfNonOwningReferencesLength : Int
        get() {
            val o = __offset(88); return if (o != 0) __vector_len(o) else 0
        }
    val vectorOfNonOwningReferencesAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(88, 8)
    fun vectorOfNonOwningReferencesInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 88, 8)
    fun mutateVectorOfNonOwningReferences(j: Int, vectorOfNonOwningReferences: ULong) : Boolean {
        val o = __offset(88)
        return if (o != 0) {
            bb.putLong(__vector(o) + j * 8, vectorOfNonOwningReferences.toLong())
            true
        } else {
            false
        }
    }
    val anyUniqueType : UByte
        get() {
            val o = __offset(90)
            return if(o != 0) bb.get(o + bb_pos).toUByte() else 0u
        }
    fun mutateAnyUniqueType(anyUniqueType: UByte) : Boolean {
        val o = __offset(90)
        return if (o != 0) {
            bb.put(o + bb_pos, anyUniqueType.toByte())
            true
        } else {
            false
        }
    }
    fun anyUnique(obj: Table) : Table? {
        val o = __offset(92); return if (o != 0) __union(obj, o) else null
    }
    val anyAmbiguousType : UByte
        get() {
            val o = __offset(94)
            return if(o != 0) bb.get(o + bb_pos).toUByte() else 0u
        }
    fun mutateAnyAmbiguousType(anyAmbiguousType: UByte) : Boolean {
        val o = __offset(94)
        return if (o != 0) {
            bb.put(o + bb_pos, anyAmbiguousType.toByte())
            true
        } else {
            false
        }
    }
    fun anyAmbiguous(obj: Table) : Table? {
        val o = __offset(96); return if (o != 0) __union(obj, o) else null
    }
    fun vectorOfEnums(j: Int) : UByte {
        val o = __offset(98)
        return if (o != 0) {
            bb.get(__vector(o) + j * 1).toUByte()
        } else {
            0u
        }
    }
    val vectorOfEnumsLength : Int
        get() {
            val o = __offset(98); return if (o != 0) __vector_len(o) else 0
        }
    val vectorOfEnumsAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(98, 1)
    fun vectorOfEnumsInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 98, 1)
    fun mutateVectorOfEnums(j: Int, vectorOfEnums: UByte) : Boolean {
        val o = __offset(98)
        return if (o != 0) {
            bb.put(__vector(o) + j * 1, vectorOfEnums.toByte())
            true
        } else {
            false
        }
    }
    override fun keysCompare(o1: Int, o2: Int, _bb: ByteBuffer) : Int {
         return compareStrings(__offset(10, o1, _bb), __offset(10, o2, _bb), _bb)
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_1_11_1()
        fun getRootAsMonster(_bb: ByteBuffer): Monster = getRootAsMonster(_bb, Monster())
        fun getRootAsMonster(_bb: ByteBuffer, obj: Monster): Monster {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun MonsterBufferHasIdentifier(_bb: ByteBuffer) : Boolean = __has_identifier(_bb, "MONS")
        fun startMonster(builder: FlatBufferBuilder) = builder.startTable(48)
        fun addPos(builder: FlatBufferBuilder, pos: Int) = builder.addStruct(0, pos, 0)
        fun addMana(builder: FlatBufferBuilder, mana: Short) = builder.addShort(1, mana, 150)
        fun addHp(builder: FlatBufferBuilder, hp: Short) = builder.addShort(2, hp, 100)
        fun addName(builder: FlatBufferBuilder, name: Int) = builder.addOffset(3, name, 0)
        fun addInventory(builder: FlatBufferBuilder, inventory: Int) = builder.addOffset(5, inventory, 0)
        fun createInventoryVector(builder: FlatBufferBuilder, data: UByteArray) : Int {
            builder.startVector(1, data.size, 1)
            for (i in data.size - 1 downTo 0) {
                builder.addByte(data[i].toByte())
            }
            return builder.endVector()
        }
        fun startInventoryVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(1, numElems, 1)
        fun addColor(builder: FlatBufferBuilder, color: UByte) = builder.addByte(6, color.toByte(), 8)
        fun addTestType(builder: FlatBufferBuilder, testType: UByte) = builder.addByte(7, testType.toByte(), 0)
        fun addTest(builder: FlatBufferBuilder, test: Int) = builder.addOffset(8, test, 0)
        fun addTest4(builder: FlatBufferBuilder, test4: Int) = builder.addOffset(9, test4, 0)
        fun startTest4Vector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 2)
        fun addTestarrayofstring(builder: FlatBufferBuilder, testarrayofstring: Int) = builder.addOffset(10, testarrayofstring, 0)
        fun createTestarrayofstringVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addOffset(data[i])
            }
            return builder.endVector()
        }
        fun startTestarrayofstringVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        fun addTestarrayoftables(builder: FlatBufferBuilder, testarrayoftables: Int) = builder.addOffset(11, testarrayoftables, 0)
        fun createTestarrayoftablesVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addOffset(data[i])
            }
            return builder.endVector()
        }
        fun startTestarrayoftablesVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        fun addEnemy(builder: FlatBufferBuilder, enemy: Int) = builder.addOffset(12, enemy, 0)
        fun addTestnestedflatbuffer(builder: FlatBufferBuilder, testnestedflatbuffer: Int) = builder.addOffset(13, testnestedflatbuffer, 0)
        fun createTestnestedflatbufferVector(builder: FlatBufferBuilder, data: UByteArray) : Int {
            builder.startVector(1, data.size, 1)
            for (i in data.size - 1 downTo 0) {
                builder.addByte(data[i].toByte())
            }
            return builder.endVector()
        }
        fun startTestnestedflatbufferVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(1, numElems, 1)
        fun addTestempty(builder: FlatBufferBuilder, testempty: Int) = builder.addOffset(14, testempty, 0)
        fun addTestbool(builder: FlatBufferBuilder, testbool: Boolean) = builder.addBoolean(15, testbool, false)
        fun addTesthashs32Fnv1(builder: FlatBufferBuilder, testhashs32Fnv1: Int) = builder.addInt(16, testhashs32Fnv1, 0)
        fun addTesthashu32Fnv1(builder: FlatBufferBuilder, testhashu32Fnv1: UInt) = builder.addInt(17, testhashu32Fnv1.toInt(), 0)
        fun addTesthashs64Fnv1(builder: FlatBufferBuilder, testhashs64Fnv1: Long) = builder.addLong(18, testhashs64Fnv1, 0L)
        fun addTesthashu64Fnv1(builder: FlatBufferBuilder, testhashu64Fnv1: ULong) = builder.addLong(19, testhashu64Fnv1.toLong(), 0)
        fun addTesthashs32Fnv1a(builder: FlatBufferBuilder, testhashs32Fnv1a: Int) = builder.addInt(20, testhashs32Fnv1a, 0)
        fun addTesthashu32Fnv1a(builder: FlatBufferBuilder, testhashu32Fnv1a: UInt) = builder.addInt(21, testhashu32Fnv1a.toInt(), 0)
        fun addTesthashs64Fnv1a(builder: FlatBufferBuilder, testhashs64Fnv1a: Long) = builder.addLong(22, testhashs64Fnv1a, 0L)
        fun addTesthashu64Fnv1a(builder: FlatBufferBuilder, testhashu64Fnv1a: ULong) = builder.addLong(23, testhashu64Fnv1a.toLong(), 0)
        fun addTestarrayofbools(builder: FlatBufferBuilder, testarrayofbools: Int) = builder.addOffset(24, testarrayofbools, 0)
        fun createTestarrayofboolsVector(builder: FlatBufferBuilder, data: BooleanArray) : Int {
            builder.startVector(1, data.size, 1)
            for (i in data.size - 1 downTo 0) {
                builder.addBoolean(data[i])
            }
            return builder.endVector()
        }
        fun startTestarrayofboolsVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(1, numElems, 1)
        fun addTestf(builder: FlatBufferBuilder, testf: Float) = builder.addFloat(25, testf, 3.14159)
        fun addTestf2(builder: FlatBufferBuilder, testf2: Float) = builder.addFloat(26, testf2, 3.0)
        fun addTestf3(builder: FlatBufferBuilder, testf3: Float) = builder.addFloat(27, testf3, 0.0)
        fun addTestarrayofstring2(builder: FlatBufferBuilder, testarrayofstring2: Int) = builder.addOffset(28, testarrayofstring2, 0)
        fun createTestarrayofstring2Vector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addOffset(data[i])
            }
            return builder.endVector()
        }
        fun startTestarrayofstring2Vector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        fun addTestarrayofsortedstruct(builder: FlatBufferBuilder, testarrayofsortedstruct: Int) = builder.addOffset(29, testarrayofsortedstruct, 0)
        fun startTestarrayofsortedstructVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(8, numElems, 4)
        fun addFlex(builder: FlatBufferBuilder, flex: Int) = builder.addOffset(30, flex, 0)
        fun createFlexVector(builder: FlatBufferBuilder, data: UByteArray) : Int {
            builder.startVector(1, data.size, 1)
            for (i in data.size - 1 downTo 0) {
                builder.addByte(data[i].toByte())
            }
            return builder.endVector()
        }
        fun startFlexVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(1, numElems, 1)
        fun addTest5(builder: FlatBufferBuilder, test5: Int) = builder.addOffset(31, test5, 0)
        fun startTest5Vector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 2)
        fun addVectorOfLongs(builder: FlatBufferBuilder, vectorOfLongs: Int) = builder.addOffset(32, vectorOfLongs, 0)
        fun createVectorOfLongsVector(builder: FlatBufferBuilder, data: LongArray) : Int {
            builder.startVector(8, data.size, 8)
            for (i in data.size - 1 downTo 0) {
                builder.addLong(data[i])
            }
            return builder.endVector()
        }
        fun startVectorOfLongsVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(8, numElems, 8)
        fun addVectorOfDoubles(builder: FlatBufferBuilder, vectorOfDoubles: Int) = builder.addOffset(33, vectorOfDoubles, 0)
        fun createVectorOfDoublesVector(builder: FlatBufferBuilder, data: DoubleArray) : Int {
            builder.startVector(8, data.size, 8)
            for (i in data.size - 1 downTo 0) {
                builder.addDouble(data[i])
            }
            return builder.endVector()
        }
        fun startVectorOfDoublesVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(8, numElems, 8)
        fun addParentNamespaceTest(builder: FlatBufferBuilder, parentNamespaceTest: Int) = builder.addOffset(34, parentNamespaceTest, 0)
        fun addVectorOfReferrables(builder: FlatBufferBuilder, vectorOfReferrables: Int) = builder.addOffset(35, vectorOfReferrables, 0)
        fun createVectorOfReferrablesVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addOffset(data[i])
            }
            return builder.endVector()
        }
        fun startVectorOfReferrablesVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        fun addSingleWeakReference(builder: FlatBufferBuilder, singleWeakReference: ULong) = builder.addLong(36, singleWeakReference.toLong(), 0)
        fun addVectorOfWeakReferences(builder: FlatBufferBuilder, vectorOfWeakReferences: Int) = builder.addOffset(37, vectorOfWeakReferences, 0)
        fun createVectorOfWeakReferencesVector(builder: FlatBufferBuilder, data: ULongArray) : Int {
            builder.startVector(8, data.size, 8)
            for (i in data.size - 1 downTo 0) {
                builder.addLong(data[i].toLong())
            }
            return builder.endVector()
        }
        fun startVectorOfWeakReferencesVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(8, numElems, 8)
        fun addVectorOfStrongReferrables(builder: FlatBufferBuilder, vectorOfStrongReferrables: Int) = builder.addOffset(38, vectorOfStrongReferrables, 0)
        fun createVectorOfStrongReferrablesVector(builder: FlatBufferBuilder, data: IntArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addOffset(data[i])
            }
            return builder.endVector()
        }
        fun startVectorOfStrongReferrablesVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        fun addCoOwningReference(builder: FlatBufferBuilder, coOwningReference: ULong) = builder.addLong(39, coOwningReference.toLong(), 0)
        fun addVectorOfCoOwningReferences(builder: FlatBufferBuilder, vectorOfCoOwningReferences: Int) = builder.addOffset(40, vectorOfCoOwningReferences, 0)
        fun createVectorOfCoOwningReferencesVector(builder: FlatBufferBuilder, data: ULongArray) : Int {
            builder.startVector(8, data.size, 8)
            for (i in data.size - 1 downTo 0) {
                builder.addLong(data[i].toLong())
            }
            return builder.endVector()
        }
        fun startVectorOfCoOwningReferencesVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(8, numElems, 8)
        fun addNonOwningReference(builder: FlatBufferBuilder, nonOwningReference: ULong) = builder.addLong(41, nonOwningReference.toLong(), 0)
        fun addVectorOfNonOwningReferences(builder: FlatBufferBuilder, vectorOfNonOwningReferences: Int) = builder.addOffset(42, vectorOfNonOwningReferences, 0)
        fun createVectorOfNonOwningReferencesVector(builder: FlatBufferBuilder, data: ULongArray) : Int {
            builder.startVector(8, data.size, 8)
            for (i in data.size - 1 downTo 0) {
                builder.addLong(data[i].toLong())
            }
            return builder.endVector()
        }
        fun startVectorOfNonOwningReferencesVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(8, numElems, 8)
        fun addAnyUniqueType(builder: FlatBufferBuilder, anyUniqueType: UByte) = builder.addByte(43, anyUniqueType.toByte(), 0)
        fun addAnyUnique(builder: FlatBufferBuilder, anyUnique: Int) = builder.addOffset(44, anyUnique, 0)
        fun addAnyAmbiguousType(builder: FlatBufferBuilder, anyAmbiguousType: UByte) = builder.addByte(45, anyAmbiguousType.toByte(), 0)
        fun addAnyAmbiguous(builder: FlatBufferBuilder, anyAmbiguous: Int) = builder.addOffset(46, anyAmbiguous, 0)
        fun addVectorOfEnums(builder: FlatBufferBuilder, vectorOfEnums: Int) = builder.addOffset(47, vectorOfEnums, 0)
        fun createVectorOfEnumsVector(builder: FlatBufferBuilder, data: UByteArray) : Int {
            builder.startVector(1, data.size, 1)
            for (i in data.size - 1 downTo 0) {
                builder.addByte(data[i].toByte())
            }
            return builder.endVector()
        }
        fun startVectorOfEnumsVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(1, numElems, 1)
        fun endMonster(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
                builder.required(o, 10)
            return o
        }
        fun finishMonsterBuffer(builder: FlatBufferBuilder, offset: Int) = builder.finish(offset, "MONS")
        fun finishSizePrefixedMonsterBuffer(builder: FlatBufferBuilder, offset: Int) = builder.finishSizePrefixed(offset, "MONS")
        fun __lookup_by_key(obj: Monster?, vectorLocation: Int, key: String, bb: ByteBuffer) : Monster? {
            val byteKey = key.toByteArray(Table.UTF8_CHARSET.get()!!)
            var span = bb.getInt(vectorLocation - 4)
            var start = 0
            while (span != 0) {
                var middle = span / 2
                val tableOffset = __indirect(vectorLocation + 4 * (start + middle), bb)
                val comp = compareStrings(__offset(10, bb.capacity() - tableOffset, bb), byteKey, bb)
                when {
                    comp > 0 -> span = middle
                    comp < 0 -> {
                        middle++
                        start += middle
                        span -= middle
                    }
                    else -> {
                        return (obj ?: Monster()).__assign(tableOffset, bb)
                    }
                }
            }
            return null
        }
    }
}
