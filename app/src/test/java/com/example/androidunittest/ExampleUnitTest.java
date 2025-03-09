package com.example.androidunittest;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    /*
        Kasus Uji 1: Memeriksa apakah fungsi penjumlahan bekerja dengan benar
        - Input: 2 + 2
        - Proses: Menjalankan operasi penjumlahan
        - Hasil yang Seharusnya: 4
    */
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    /*
        Kasus Uji 2: Memeriksa apakah dua string memiliki nilai yang sama
        - Input: "hello" dan "hello"
        - Proses: Membandingkan kedua string
        - Hasil yang Seharusnya: true (karena string sama persis)
    */
    @Test
    public void stringComparison_isCorrect() {
        assertEquals("hello", "hello");
    }
}