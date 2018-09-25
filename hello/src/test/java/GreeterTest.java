import it.codedoge.DogNameProvider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GreeterTest {

    private Greeter greeter;

    @Before
    public void setUp() throws Exception {
        this.greeter = new Greeter(new DogNameProvider());
    }


    @Test
    public void greet() {
        Assert.assertEquals("Hi! Ulysses.",greeter.greet());
    }
}