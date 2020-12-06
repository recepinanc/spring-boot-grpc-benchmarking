package com.recepinanc.samplespringbootserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ProtobufConfiguration
{

    @Bean
    ProtobufHttpMessageConverter protobufHttpMessageConverter()
    {
        return new ProtobufHttpMessageConverter();
    }

    @Bean
    RestTemplate restTemplate(ProtobufHttpMessageConverter protobufHttpMessageConverter)
    {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(protobufHttpMessageConverter);

        return restTemplate;
    }
}
