import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.fail;

public class A {
    @Test
    public void a() {
        fail();
    }

    @Category(SlowTest.class)
    @Test
    public void b() {

    }

    @Category(FastTest.class)
    @Test
    public void c() {
    }
}
