package ru.alexander.javaspringtests;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import ru.alexander.javaspringtests.service.KMP;

public class KMPTests {

    @Test
    public void testKMPsearch_Found() {
        String text = "ababcabcabababd";
        String pattern = "ababd";
        int result = KMP.KMPsearch(text, pattern);
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void testKMPsearch_NotFound() {
        String text = "ababcabcabababd";
        String pattern = "xyz";
        int result = KMP.KMPsearch(text, pattern);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void testKMPsearch_EmptyPattern() {
        String text = "ababcabcabababd";
        String pattern = "";
        int result = KMP.KMPsearch(text, pattern);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testKMPsearch_EmptyText() {
        String text = "";
        String pattern = "abc";
        int result = KMP.KMPsearch(text, pattern);
        assertThat(result).isEqualTo(-1);
    }
}