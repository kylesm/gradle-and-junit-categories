import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.fail;

@RunWith(org.junit.experimental.categories.Categories.class)
@Category(SlowTest.class)
public class B {
    @Ignore
    @Test
    public void a() {
        fail();
    }

    @Test
    public void b() {
    }

    @Category(FastTest.class)
    @Test
    public void c() {
    }
}
