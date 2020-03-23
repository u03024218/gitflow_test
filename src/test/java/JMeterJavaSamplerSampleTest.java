import org.junit.*;

import dk.nversion.JMeterJavaSamplerSample;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;

public class JMeterJavaSamplerSampleTest {
	@Test
	public void testJavaSamplerSample() {
		
		Arguments p = new Arguments();
		p.addArgument("URL", "http://www.baidu.com/");
		p.addArgument("SEARCHFOR", "newspaint");
		JMeterJavaSamplerSample jjss = new JMeterJavaSamplerSample();
		JavaSamplerContext arg0 = new JavaSamplerContext(p);
		jjss.runTest(arg0);
	}
}
