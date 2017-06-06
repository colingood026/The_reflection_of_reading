import org.junit.Test;
import org.junit.runner.RunWith;
import org.soundSystem.CdPlayerConfig;
import org.soundSystem.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Colin on 2017/6/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CdPlayerConfig.class})
public class SpringTest {

    @Autowired
    private CompactDisc cd;

    @Test
    public void test() {

        System.out.println(cd == null ? true : false);
    }
}
