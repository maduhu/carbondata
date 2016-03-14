/**
 * Generated by Agitar build: AgitarOne Version 5.3.0.000022 (Build date: Jan 04, 2012) [5.3.0.000022]
 * JDK Version: 1.6.0_14
 *
 * Generated on 29 Jul, 2013 2:34:59 PM
 * Time to generate: 00:17.523 seconds
 *
 */

package com.huawei.unibi.molap.datastorage.store.compression.type;

import com.agitar.lib.junit.AgitarTestCase;
import com.agitar.lib.mockingbird.Mockingbird;
import com.huawei.iweb.platform.logging.LogService;
import com.huawei.unibi.molap.datastorage.store.compression.Compressor;
import com.huawei.unibi.molap.datastorage.store.compression.ValueCompressionUtil;
import com.huawei.unibi.molap.datastorage.store.compression.ValueCompressonHolder;
import com.huawei.unibi.molap.util.MolapCoreLogEvent;
import java.nio.ByteBuffer;

public class UnCompressNonDecimalMaxMinLongAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return UnCompressNonDecimalMaxMinLong.class;
    }
    
    public void testConstructor() throws Throwable {
        new UnCompressNonDecimalMaxMinLong();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testCompressWithAggressiveMocks() throws Throwable {
        storeStaticField(UnCompressNonDecimalMaxMinLong.class, "longCompressor");
        UnCompressNonDecimalMaxMinLong unCompressNonDecimalMaxMinLong = (UnCompressNonDecimalMaxMinLong) Mockingbird.getProxyObject(UnCompressNonDecimalMaxMinLong.class, true);
        long[] longs = new long[0];
        Mockingbird.enterRecordingMode();
        Mockingbird.replaceObjectForRecording(UnCompressNonDecimalMaxMinByte.class, "<init>()", new UnCompressNonDecimalMaxMinByte());
        Compressor compressor = (Compressor) Mockingbird.getProxyObject(Compressor.class);
        byte[] bytes = new byte[0];
        Mockingbird.enterNormalMode();
        unCompressNonDecimalMaxMinLong.setValue(longs);
        setPrivateField(UnCompressNonDecimalMaxMinLong.class, "longCompressor", compressor);
        Mockingbird.enterRecordingMode();
        Mockingbird.setReturnValue(compressor.compress(longs), bytes);
        Mockingbird.enterTestMode(UnCompressNonDecimalMaxMinLong.class);
        ValueCompressonHolder.UnCompressValue result = unCompressNonDecimalMaxMinLong.compress();
        assertEquals("result.getBackArrayData().length", 0, result.getBackArrayData().length);
        assertNotNull("unCompressNonDecimalMaxMinLongUnCompressNonDecimalMaxMinLong.longCompressor", getPrivateField(UnCompressNonDecimalMaxMinLong.class, "longCompressor"));
    }
    
    public void testGetBackArrayData() throws Throwable {
        UnCompressNonDecimalMaxMinLong unCompressNonDecimalMaxMinLong = new UnCompressNonDecimalMaxMinLong();
        long[] value = new long[0];
        unCompressNonDecimalMaxMinLong.setValue(value);
        byte[] result = unCompressNonDecimalMaxMinLong.getBackArrayData();
        assertEquals("result.length", 0, result.length);
    }
    
    public void testGetBackArrayData1() throws Throwable {
        long[] value = new long[7];
        UnCompressNonDecimalMaxMinLong unCompressNonDecimalMaxMinLong = new UnCompressNonDecimalMaxMinLong();
        unCompressNonDecimalMaxMinLong.setValue(value);
        byte[] result = unCompressNonDecimalMaxMinLong.getBackArrayData();
        assertEquals("result.length", 56, result.length);
        assertEquals("result[0]", (byte)0, result[0]);
    }
    
    public void testGetCompressorObject() throws Throwable {
        UnCompressNonDecimalMaxMinByte result = (UnCompressNonDecimalMaxMinByte) new UnCompressNonDecimalMaxMinLong().getCompressorObject();
        assertNull("result.getBackArrayData()", result.getBackArrayData());
    }
    
    public void testGetNew() throws Throwable {
        UnCompressNonDecimalMaxMinLong result = (UnCompressNonDecimalMaxMinLong) new UnCompressNonDecimalMaxMinLong().getNew();
        assertNotNull("result", result);
    }
    
    public void testGetNewWithAggressiveMocks() throws Throwable {
        storeStaticField(MolapCoreLogEvent.class, "UNIBI_MOLAPCORE_MSG");
        storeStaticField(UnCompressNonDecimalMaxMinLong.class, "LOGGER");
        UnCompressNonDecimalMaxMinLong unCompressNonDecimalMaxMinLong = (UnCompressNonDecimalMaxMinLong) Mockingbird.getProxyObject(UnCompressNonDecimalMaxMinLong.class, true);
        CloneNotSupportedException cloneNotSupportedException = (CloneNotSupportedException) Mockingbird.getProxyObject(CloneNotSupportedException.class);
        LogService logService = (LogService) Mockingbird.getProxyObject(LogService.class);
        Mockingbird.enterRecordingMode();
        Mockingbird.setException(false, unCompressNonDecimalMaxMinLong, "clone", "()java.lang.Object", new Object[] {}, cloneNotSupportedException, 1);
        setPrivateField(UnCompressNonDecimalMaxMinLong.class, "LOGGER", logService);
        setPrivateField(MolapCoreLogEvent.class, "UNIBI_MOLAPCORE_MSG", null);
        Mockingbird.setReturnValue(false, cloneNotSupportedException, "getMessage", "()java.lang.String", new Object[] {}, "", 1);
        Mockingbird.setReturnValue(false, logService, "error", "(com.huawei.iweb.platform.logging.LogEvent,java.lang.Throwable,java.lang.Object[])void", null, 1);
        Mockingbird.enterTestMode(UnCompressNonDecimalMaxMinLong.class);
        ValueCompressonHolder.UnCompressValue result = unCompressNonDecimalMaxMinLong.getNew();
        assertNull("result", result);
    }
    
    public void testGetValue() throws Throwable {
        UnCompressNonDecimalMaxMinLong unCompressNonDecimalMaxMinLong = new UnCompressNonDecimalMaxMinLong();
        byte[] value = new byte[26];
        unCompressNonDecimalMaxMinLong.setValueInBytes(value);
        double result = unCompressNonDecimalMaxMinLong.getValue(0, 100, 100.0);
        assertEquals("result", 1.0E-98, result, 1.0E-6);
    }
    
    public void testGetValue1() throws Throwable {
        long[] value = new long[7];
        UnCompressNonDecimalMaxMinLong unCompressNonDecimalMaxMinLong = new UnCompressNonDecimalMaxMinLong();
        unCompressNonDecimalMaxMinLong.setValue(value);
        double result = unCompressNonDecimalMaxMinLong.getValue(0, -1, 100.0);
        assertEquals("result", 1000.0, result, 1.0E-6);
    }
    
    public void testSetValue() throws Throwable {
        long[] value = new long[3];
        UnCompressNonDecimalMaxMinLong unCompressNonDecimalMaxMinLong = new UnCompressNonDecimalMaxMinLong();
        unCompressNonDecimalMaxMinLong.setValue(value);
        assertEquals("unCompressNonDecimalMaxMinLong.getBackArrayData().length", 24, unCompressNonDecimalMaxMinLong.getBackArrayData().length);
    }
    
    public void testSetValueInBytes() throws Throwable {
        UnCompressNonDecimalMaxMinLong unCompressNonDecimalMaxMinLong = new UnCompressNonDecimalMaxMinLong();
        byte[] value = new byte[0];
        unCompressNonDecimalMaxMinLong.setValueInBytes(value);
        assertEquals("unCompressNonDecimalMaxMinLong.getBackArrayData().length", 0, unCompressNonDecimalMaxMinLong.getBackArrayData().length);
    }
    
    public void testUncompress() throws Throwable {
        ValueCompressonHolder.UnCompressValue result = new UnCompressNonDecimalMaxMinLong().uncompress(ValueCompressionUtil.DataType.DATA_INT);
        assertNull("result", result);
    }
    
    public void testGetBackArrayDataThrowsNullPointerException() throws Throwable {
        try {
            new UnCompressNonDecimalMaxMinLong().getBackArrayData();
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ValueCompressionUtil.class, ex);
        }
    }
    
    public void testGetValueThrowsArrayIndexOutOfBoundsException() throws Throwable {
        long[] value = new long[7];
        UnCompressNonDecimalMaxMinLong unCompressNonDecimalMaxMinLong = new UnCompressNonDecimalMaxMinLong();
        unCompressNonDecimalMaxMinLong.setValue(value);
        try {
            unCompressNonDecimalMaxMinLong.getValue(100, 1000, 100.0);
            fail("Expected ArrayIndexOutOfBoundsException to be thrown");
        } catch (ArrayIndexOutOfBoundsException ex) {
            assertEquals("ex.getMessage()", "100", ex.getMessage());
            assertThrownBy(UnCompressNonDecimalMaxMinLong.class, ex);
        }
    }
    
    public void testGetValueThrowsNullPointerException() throws Throwable {
        try {
            new UnCompressNonDecimalMaxMinLong().getValue(100, 1000, 100.0);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(UnCompressNonDecimalMaxMinLong.class, ex);
        }
    }
    
    public void testSetValueInBytesThrowsNullPointerException() throws Throwable {
        UnCompressNonDecimalMaxMinLong unCompressNonDecimalMaxMinLong = new UnCompressNonDecimalMaxMinLong();
        try {
            unCompressNonDecimalMaxMinLong.setValueInBytes((byte[]) null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ByteBuffer.class, ex);
            assertNull("unCompressNonDecimalMaxMinLong.value", getPrivateField(unCompressNonDecimalMaxMinLong, "value"));
        }
    }
}
