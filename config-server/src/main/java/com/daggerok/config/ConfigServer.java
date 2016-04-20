package com.daggerok.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.boot.actuate.autoconfigure.EndpointAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.EndpointWebMvcAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.EndpointWebMvcHypermediaManagementContextConfiguration;
import org.springframework.boot.actuate.autoconfigure.EndpointWebMvcManagementContextConfiguration;
import org.springframework.boot.actuate.autoconfigure.HealthIndicatorAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.ManagementServerPropertiesAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.AuditAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.CacheStatisticsAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.CrshAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.EndpointMBeanExportAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.JolokiaAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.MetricExportAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.MetricFilterAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.MetricRepositoryAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.MetricsChannelAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.MetricsDropwizardAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.PublicMetricsAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.TraceRepositoryAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.TraceWebFilterAutoConfiguration;
import org.springframework.boot.autoconfigure.PropertyPlaceholderAutoConfiguration;
import org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration;
import org.springframework.boot.autoconfigure.cloud.CloudAutoConfiguration;
import org.springframework.boot.autoconfigure.hateoas.HypermediaAutoConfiguration;
import org.springframework.boot.autoconfigure.hateoas.HypermediaHttpMessageConverterConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JndiConnectionFactoryAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.hornetq.HornetQAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.artemis.ArtemisAutoConfiguration;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpEncodingAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ServerPropertiesAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.MessageSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.boot.autoconfigure.cache.InfinispanCacheConfiguration;
import org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration;
import org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchAutoConfiguration;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.data.solr.SolrRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.autoconfigure.hazelcast.HazelcastAutoConfiguration;
import org.springframework.boot.autoconfigure.hazelcast.HazelcastJpaDependencyAutoConfiguration;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JndiDataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jersey.JerseyAutoConfiguration;
import org.springframework.boot.autoconfigure.jooq.JooqAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.autoconfigure.mail.MailSenderAutoConfiguration;
import org.springframework.boot.autoconfigure.mail.MailSenderValidatorAutoConfiguration;
import org.springframework.boot.autoconfigure.mobile.DeviceDelegatingViewResolverAutoConfiguration;
import org.springframework.boot.autoconfigure.mobile.DeviceResolverAutoConfiguration;
import org.springframework.boot.autoconfigure.mobile.SitePreferenceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mustache.MustacheAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.reactor.ReactorAutoConfiguration;
import org.springframework.boot.autoconfigure.security.FallbackWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityFilterAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.OAuth2AutoConfiguration;
import org.springframework.boot.autoconfigure.sendgrid.SendGridAutoConfiguration;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.boot.autoconfigure.social.FacebookAutoConfiguration;
import org.springframework.boot.autoconfigure.social.LinkedInAutoConfiguration;
import org.springframework.boot.autoconfigure.social.SocialWebAutoConfiguration;
import org.springframework.boot.autoconfigure.social.TwitterAutoConfiguration;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;
import org.springframework.boot.autoconfigure.velocity.VelocityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.WebSocketMessagingAutoConfiguration;
// import org.springframework.boot.devtools.autoconfigure.DevToolsDataSourceAutoConfiguration;
// import org.springframework.boot.devtools.autoconfigure.LocalDevToolsAutoConfiguration;
// import org.springframework.boot.devtools.autoconfigure.RemoteDevToolsAutoConfiguration;
import org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration;
import org.springframework.cloud.autoconfigure.LifecycleMvcEndpointAutoConfiguration;
import org.springframework.cloud.autoconfigure.RefreshAutoConfiguration;
import org.springframework.cloud.autoconfigure.RefreshEndpointAutoConfiguration;
import org.springframework.cloud.client.CommonsClientAutoConfiguration;
import org.springframework.cloud.client.hypermedia.CloudHypermediaAutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalancerAutoConfiguration;
import org.springframework.cloud.client.discovery.noop.NoopDiscoveryClientAutoConfiguration;
import org.springframework.cloud.commons.util.UtilAutoConfiguration;
import org.springframework.cloud.config.client.ConfigClientAutoConfiguration;
import org.springframework.cloud.config.server.config.ConfigServerMvcConfiguration;
import org.springframework.cloud.config.server.config.EncryptionAutoConfiguration;
import org.springframework.cloud.config.server.config.EnvironmentRepositoryConfiguration;
import org.springframework.cloud.config.server.config.ResourceRepositoryConfiguration;
import org.springframework.cloud.config.server.config.SingleEncryptorAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration;
import org.springframework.cloud.netflix.eureka.config.EurekaClientConfigServerAutoConfiguration;
import org.springframework.cloud.netflix.eureka.config.EurekaDiscoveryClientConfigServiceAutoConfiguration;
import org.springframework.cloud.netflix.feign.FeignAutoConfiguration;
import org.springframework.cloud.netflix.feign.encoding.FeignAcceptGzipEncodingAutoConfiguration;
import org.springframework.cloud.netflix.feign.encoding.FeignContentGzipEncodingAutoConfiguration;
import org.springframework.cloud.netflix.feign.ribbon.FeignRibbonClientAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.HystrixAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.HystrixCircuitBreakerConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration;
import org.springframework.cloud.netflix.ribbon.eureka.RibbonEurekaAutoConfiguration;
import org.springframework.cloud.netflix.rx.RxJavaAutoConfiguration;
import org.springframework.cloud.netflix.metrics.MetricsInterceptorConfiguration;
import org.springframework.cloud.netflix.metrics.servo.ServoMetricsAutoConfiguration;
/*
@EnableConfigServer
@SpringCloudApplication
@EnableAutoConfiguration(exclude = {
//        HealthIndicatorAutoConfiguration.class,
//        PropertyPlaceholderAutoConfiguration.class,
//        RefreshAutoConfiguration.class,
//        ResourceRepositoryConfiguration.class,
//        EurekaClientAutoConfiguration.class,
//        EurekaClientConfigServerAutoConfiguration.class,
//        EurekaDiscoveryClientConfigServiceAutoConfiguration.class,
//        EurekaDiscoveryClientConfiguration.class,
//        RibbonAutoConfiguration.class,
//        RibbonEurekaAutoConfiguration.class,
//        LoadBalancerAutoConfiguration.class,
//        HystrixAutoConfiguration.class,
//        HystrixCircuitBreakerConfiguration.class,
//        RxJavaAutoConfiguration.class,
//        CommonsClientAutoConfiguration.class,
//        ConfigServerMvcConfiguration.class,
//        ConfigurationPropertiesRebinderAutoConfiguration.class,
//        ConfigurationPropertiesAutoConfiguration.class,
//        ConfigClientAutoConfiguration.class,
//        CloudAutoConfiguration.class,
//        CloudHypermediaAutoConfiguration.class,
//        ServerPropertiesAutoConfiguration.class,
//        UtilAutoConfiguration.class,
//        WebMvcAutoConfiguration.class,
//        EndpointWebMvcAutoConfiguration.class,
//        ArtemisAutoConfiguration.class,
//        EndpointAutoConfiguration.class,
//        RefreshEndpointAutoConfiguration.class,
//        LifecycleMvcEndpointAutoConfiguration.class,
//        FeignContentGzipEncodingAutoConfiguration.class,
//        FeignAcceptGzipEncodingAutoConfiguration.class,
//        FeignRibbonClientAutoConfiguration.class,
//        FeignAutoConfiguration.class,
//        ArchaiusAutoConfiguration.class,
//        SingleEncryptorAutoConfiguration.class,
//        EncryptionAutoConfiguration.class,
//        EnvironmentRepositoryConfiguration.class,
//        DispatcherServletAutoConfiguration.class,
//        EmbeddedServletContainerAutoConfiguration.class,
//        HttpEncodingAutoConfiguration.class,
//        HypermediaAutoConfiguration.class,
//        HttpMessageConvertersAutoConfiguration.class,
//        HypermediaHttpMessageConverterConfiguration.class,
//        JacksonAutoConfiguration.class,
//        ManagementServerPropertiesAutoConfiguration.class,
//        EndpointWebMvcManagementContextConfiguration.class,
//        DataSourceTransactionManagerAutoConfiguration.class,
//        EndpointWebMvcHypermediaManagementContextConfiguration.class,
//        ErrorMvcAutoConfiguration.class,
//        ActiveMQAutoConfiguration.class,
//        HornetQAutoConfiguration.class,
//        JmsAutoConfiguration.class,
//        JndiConnectionFactoryAutoConfiguration.class,
//        SpringApplicationAdminJmxAutoConfiguration.class,
//        JmxAutoConfiguration.class,
        ServoMetricsAutoConfiguration.class,
        MetricsInterceptorConfiguration.class,
        MetricFilterAutoConfiguration.class,
        PublicMetricsAutoConfiguration.class,
        TraceRepositoryAutoConfiguration.class,
        TraceWebFilterAutoConfiguration.class,
        //
        BatchAutoConfiguration.class,
        CacheAutoConfiguration.class,
        CacheStatisticsAutoConfiguration.class,
        CassandraAutoConfiguration.class,
        CassandraDataAutoConfiguration.class,
        CassandraRepositoriesAutoConfiguration.class,
        CrshAutoConfiguration.class,
        DataSourceAutoConfiguration.class,
        // DevToolsDataSourceAutoConfiguration.class,
        DeviceDelegatingViewResolverAutoConfiguration.class,
        DeviceResolverAutoConfiguration.class,
        ElasticsearchAutoConfiguration.class,
        ElasticsearchDataAutoConfiguration.class,
        ElasticsearchRepositoriesAutoConfiguration.class,
        EndpointMBeanExportAutoConfiguration.class,
        FacebookAutoConfiguration.class,
        FallbackWebSecurityAutoConfiguration.class,
        FlywayAutoConfiguration.class,
        FreeMarkerAutoConfiguration.class,
        GroovyTemplateAutoConfiguration.class,
        GsonAutoConfiguration.class,
        HazelcastAutoConfiguration.class,
        HazelcastJpaDependencyAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class,
        InfinispanCacheConfiguration.class,
        IntegrationAutoConfiguration.class,
        JerseyAutoConfiguration.class,
        JndiDataSourceAutoConfiguration.class,
        JolokiaAutoConfiguration.class,
        JooqAutoConfiguration.class,
        JpaRepositoriesAutoConfiguration.class,
        JtaAutoConfiguration.class,
        LinkedInAutoConfiguration.class,
        LiquibaseAutoConfiguration.class,
        // LocalDevToolsAutoConfiguration.class,
        MailSenderAutoConfiguration.class,
        MailSenderValidatorAutoConfiguration.class,
        MessageSourceAutoConfiguration.class,
        MetricExportAutoConfiguration.class,
        MetricRepositoryAutoConfiguration.class,
        MetricsChannelAutoConfiguration.class,
        MetricsDropwizardAutoConfiguration.class,
        MongoAutoConfiguration.class,
        EmbeddedMongoAutoConfiguration.class,
        MongoDataAutoConfiguration.class,
        MongoRepositoriesAutoConfiguration.class,
        MustacheAutoConfiguration.class,
        NoopDiscoveryClientAutoConfiguration.class,
        OAuth2AutoConfiguration.class,
        PersistenceExceptionTranslationAutoConfiguration.class,
        RabbitAutoConfiguration.class,
        ReactorAutoConfiguration.class,
        RedisAutoConfiguration.class,
        // RemoteDevToolsAutoConfiguration.class,
        RepositoryRestMvcAutoConfiguration.class,
        SecurityAutoConfiguration.class,
        SecurityFilterAutoConfiguration.class,
        SendGridAutoConfiguration.class,
        SessionAutoConfiguration.class,
        SitePreferenceAutoConfiguration.class,
        SocialWebAutoConfiguration.class,
        SolrAutoConfiguration.class,
        SolrRepositoriesAutoConfiguration.class,
        SpringDataWebAutoConfiguration.class,
        ThymeleafAutoConfiguration.class,
        TransactionAutoConfiguration.class,
        TwitterAutoConfiguration.class,
        VelocityAutoConfiguration.class,
//
        AuditAutoConfiguration.class,
        XADataSourceAutoConfiguration.class,
        WebSocketMessagingAutoConfiguration.class,
        WebSocketAutoConfiguration.class,
        MultipartAutoConfiguration.class,
//
        ManagementWebSecurityAutoConfiguration.class,
        AopAutoConfiguration.class
// out ot the classpath:
        ///GenericCacheConfiguration.class,
        ///JacksonHttpMessageConvertersConfiguration.class,
        ///GsonHttpMessageConvertersConfiguration.class,
        ///GuavaCacheConfiguration.class,
        ///NoOpCacheConfiguration.class,
        ///RedisCacheConfiguration.class,
        ///SimpleCacheConfiguration.class,
        ///EhCacheCacheConfiguration.class,
        ///HazelcastCacheConfiguration.class,
        ///JCacheCacheConfiguration.class
})*/
@EnableConfigServer
@SpringCloudApplication
@EnableAutoConfiguration
public class ConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class, args);
    }
}
