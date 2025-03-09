package com.example.androidunittest;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;


/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    /*
        Kasus Uji 1: Meriksa apakah konteks aplikasi sesuai dengan package yang diharapkan
        - Proses: Mendapatkan konteks aplikasi menggunakan InstrumentationRegistry
        - Hasil Seharusnya: Nama package aplikasi harus sesuai dengan "com.example.simpleapp"
    */
    @Test
    public void useAppContext() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.androidunittest", appContext.getPackageName());
    }

    /*
        Kasus Uji 2: Memeriksa apakah string sumber daya "app_name" sesuai dengan yang diharapkan
        - Proses: Mengambil nilai string "app_name" dari resource aplikasi
        - Hasil Seharusnya: "Simple App"
    */
    @Test
    public void resourceString_isCorrect() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        String appName = appContext.getString(R.string.app_name);
        assertEquals("AndroidUnitTest", appName);
    }
}
