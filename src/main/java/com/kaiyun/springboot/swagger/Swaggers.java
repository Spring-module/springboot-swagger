package com.kaiyun.springboot.swagger;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by fanya on 2017/4/10.
 */
@Configuration
@EnableSwagger2
public class Swaggers {

    /*@Bean
    public Docket swaggerSpringMvcPlugin() {
        ApiInfo apiInfo = new ApiInfo("房源渠道分发系统v3.9.0.0", "房源渠道分发系统v3.9.0.0", null, null, null, null, null);
        Docket docket = new Docket(DocumentationType.SWAGGER_2).select().paths(regex("/user/.*")).build()
                .apiInfo(apiInfo).useDefaultResponseMessages(false);
        return docket;
    }*/


	/**
	 * apiInfo:apiInfo()用来创建该Api的基本信息（这些基本信息会展现在文档页面中）. <br/>
	 *
	 * @return
	 * @since JDK 1.8
	 * @author kaiyun
	 */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("房源渠道分发系统")
                .description("房源渠道分发系统")
                .version("v3.9.0.0")
                .build();
    }
    
    /**
     * createRestApi:创建Docket的Bean. <br/>
     * 1、select()函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现，
     * 	本例采用指定扫描的包路径来定义，Swagger会扫描该包下所有Controller定义的API，并产生文档内容（除了被@ApiIgnore指定的请求）
     *
     * @return
     * @since JDK 1.8
     * @author kaiyun
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.kaiyun.springboot.swagger.web"))
                .paths(PathSelectors.any()) // regex("/users/.*")
                .build();
    }
    
}
