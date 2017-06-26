import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.model.Human;
import com.service.HumanService;

public class ApplicationRunnerTest {

	@Test
	public void test() {
		HumanService hs = mock(HumanService.class);
		hs.ReturnAllHumanCharacteristics();
		Mockito.verify(hs, times(1)).ReturnAllHumanCharacteristics();
	}
	@Test
	public void CheckIfBeanIsCalled(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AppConfig ap = new AppConfig(); 
		ap = context.getBean(AppConfig.class);
	}
	
	@Test
	public void CheckIfBeanHumanIsCalled(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Human.class);
		Human human = new Human(); 
		human = context.getBean(Human.class);
	}

}
