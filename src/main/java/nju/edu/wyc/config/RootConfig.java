package nju.edu.wyc.config;

import java.util.regex.Pattern;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.core.type.filter.RegexPatternTypeFilter;


@Configuration
@Import(HibernateConfig.class)
@ComponentScan(basePackages={"nju.edu.wyc"}, excludeFilters={
        @ComponentScan.Filter(type= FilterType.CUSTOM, value=RootConfig.WebPackage.class)
})
public class RootConfig {
  public static class WebPackage extends RegexPatternTypeFilter {
    public WebPackage() {
      super(Pattern.compile("nju.edu.wyc\\.web"));
    }    
  }
}
