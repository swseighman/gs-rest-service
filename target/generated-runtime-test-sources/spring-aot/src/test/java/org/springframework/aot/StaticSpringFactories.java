package org.springframework.aot;

import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.util.function.Supplier;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.SpringBootExceptionReporter;
import org.springframework.boot.actuate.autoconfigure.web.ManagementContextConfiguration;
import org.springframework.boot.autoconfigure._FactoryProvider;
import org.springframework.boot.context.config.ConfigDataLocationResolver;
import org.springframework.boot.diagnostics.FailureAnalyzer;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.boot.sql.init.dependency.DatabaseInitializerDetector;
import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitializationDetector;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.autoconfigure.data.cassandra.AutoConfigureDataCassandra;
import org.springframework.boot.test.autoconfigure.data.jdbc.AutoConfigureDataJdbc;
import org.springframework.boot.test.autoconfigure.data.ldap.AutoConfigureDataLdap;
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo;
import org.springframework.boot.test.autoconfigure.data.neo4j.AutoConfigureDataNeo4j;
import org.springframework.boot.test.autoconfigure.data.r2dbc.AutoConfigureDataR2dbc;
import org.springframework.boot.test.autoconfigure.data.redis.AutoConfigureDataRedis;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureJdbc;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jooq.AutoConfigureJooq;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJson;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureMockRestServiceServer;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebFlux;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.autoconfigure.webservices.client.AutoConfigureMockWebServiceServer;
import org.springframework.boot.test.autoconfigure.webservices.client.AutoConfigureWebServiceClient;
import org.springframework.boot.test.autoconfigure.webservices.server.AutoConfigureMockWebServiceClient;
import org.springframework.boot.test.autoconfigure.webservices.server.AutoConfigureWebServiceServer;
import org.springframework.boot.test.context.DefaultTestExecutionListenersPostProcessor;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationListener;
import org.springframework.core.NativeDetector;
import org.springframework.test.context.ContextCustomizerFactory;
import org.springframework.test.context.TestExecutionListener;
import org.springframework.util.ClassUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * Class generated - do not edit this file
 */
public abstract class StaticSpringFactories {
  public static MultiValueMap<Class, Supplier<Object>> factories = new LinkedMultiValueMap();

  public static MultiValueMap<Class, String> names = new LinkedMultiValueMap();

  static {
    System.setProperty("spring.xml.ignore", "true");
    if (!NativeDetector.inNativeImage()) {
      System.setProperty("org.graalvm.nativeimage.imagecode", "runtime");
    }
    if (ClassUtils.isPresent("org.hibernate.Session", null)) {
      System.setProperty("hibernate.bytecode.provider", "none");
    }
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.context.ConfigurationWarningsApplicationContextInitializer());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.context.ContextIdApplicationContextInitializer());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.context.config.DelegatingApplicationContextInitializer());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.rsocket.context.RSocketPortInfoApplicationContextInitializer());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.web.context.ServerPortInfoApplicationContextInitializer());
    factories.add(ApplicationContextInitializer.class, () -> _FactoryProvider.sharedMetadataReaderFactoryContextInitializer());
    factories.add(org.springframework.context.ApplicationContextInitializer.class, () -> new org.springframework.boot.autoconfigure.logging.ConditionEvaluationReportLoggingListener());
    names.add(AutoConfigureMockRestServiceServer.class, "org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerAutoConfiguration");
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.context.config._FactoryProvider.configDataNotFoundFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.context.properties._FactoryProvider.incompatibleConfigurationFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.context.properties._FactoryProvider.notConstructorBoundInjectionFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.beanCurrentlyInCreationFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.beanDefinitionOverrideFailureAnalyzer());
    factories.add(org.springframework.boot.diagnostics.FailureAnalyzer.class, () -> new org.springframework.boot.diagnostics.analyzer.BeanNotOfRequiredTypeFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.bindFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.bindValidationFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.unboundConfigurationPropertyFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.mutuallyExclusiveConfigurationPropertiesFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.noSuchMethodFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.noUniqueBeanDefinitionFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.portInUseFailureAnalyzer());
    names.add(FailureAnalyzer.class, "org.springframework.boot.diagnostics.analyzer.ValidationExceptionFailureAnalyzer");
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.invalidConfigurationPropertyNameFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.invalidConfigurationPropertyValueFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.diagnostics.analyzer._FactoryProvider.patternParseFailureAnalyzer());
    names.add(FailureAnalyzer.class, "org.springframework.boot.liquibase.LiquibaseChangelogMissingFailureAnalyzer");
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.web.embedded.tomcat._FactoryProvider.connectorStartFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.data.redis._FactoryProvider.redisUrlSyntaxFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.diagnostics.analyzer._FactoryProvider.noSuchBeanDefinitionFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.flyway._FactoryProvider.flywayMigrationScriptMissingFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.jdbc._FactoryProvider.dataSourceBeanCreationFailureAnalyzer());
    names.add(FailureAnalyzer.class, "org.springframework.boot.autoconfigure.jdbc.HikariDriverConfigurationFailureAnalyzer");
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.jooq._FactoryProvider.noDslContextBeanFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.r2dbc._FactoryProvider.connectionFactoryBeanCreationFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.r2dbc._FactoryProvider.missingR2dbcPoolDependencyFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.r2dbc._FactoryProvider.multipleConnectionPoolConfigurationsFailureAnalzyer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.r2dbc._FactoryProvider.noConnectionFactoryBeanFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.autoconfigure.session._FactoryProvider.nonUniqueSessionRepositoryFailureAnalyzer());
    factories.add(org.springframework.boot.diagnostics.FailureAnalyzer.class, () -> new org.springframework.nativex.GeneratedClassNotFoundExceptionFailureAnalyzer());
    factories.add(org.springframework.boot.diagnostics.FailureAnalyzer.class, () -> new org.springframework.nativex.ClassNotFoundExceptionNativeFailureAnalyzer());
    factories.add(org.springframework.boot.diagnostics.FailureAnalyzer.class, () -> new org.springframework.nativex.NoSuchMethodExceptionNativeFailureAnalyzer());
    factories.add(FailureAnalyzer.class, () -> org.springframework.boot.actuate.autoconfigure.metrics._FactoryProvider.validationFailureAnalyzer());
    names.add(AutoConfigureJooq.class, "org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration");
    names.add(AutoConfigureJooq.class, "org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration");
    names.add(AutoConfigureJooq.class, "org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration");
    names.add(AutoConfigureJooq.class, "org.springframework.boot.autoconfigure.jooq.JooqAutoConfiguration");
    names.add(AutoConfigureJooq.class, "org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration");
    names.add(AutoConfigureJooq.class, "org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration");
    names.add(AutoConfigureJooq.class, "org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration");
    names.add(AutoConfigureDataR2dbc.class, "org.springframework.boot.autoconfigure.data.r2dbc.R2dbcRepositoriesAutoConfiguration");
    names.add(AutoConfigureDataR2dbc.class, "org.springframework.boot.autoconfigure.data.r2dbc.R2dbcDataAutoConfiguration");
    names.add(AutoConfigureDataR2dbc.class, "org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration");
    names.add(AutoConfigureDataR2dbc.class, "org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration");
    names.add(AutoConfigureDataR2dbc.class, "org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration");
    names.add(AutoConfigureDataR2dbc.class, "org.springframework.boot.autoconfigure.r2dbc.R2dbcTransactionManagerAutoConfiguration");
    names.add(AutoConfigureDataR2dbc.class, "org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration");
    names.add(AutoConfigureDataR2dbc.class, "org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration");
    factories.add(org.springframework.boot.logging.LoggingSystemFactory.class, () -> new org.springframework.boot.logging.logback.LogbackLoggingSystem.Factory());
    factories.add(org.springframework.boot.logging.LoggingSystemFactory.class, () -> new org.springframework.boot.logging.log4j2.Log4J2LoggingSystem.Factory());
    factories.add(org.springframework.boot.logging.LoggingSystemFactory.class, () -> new org.springframework.boot.logging.java.JavaLoggingSystem.Factory());
    factories.add(org.springframework.boot.diagnostics.FailureAnalysisReporter.class, () -> new org.springframework.boot.diagnostics.LoggingFailureAnalysisReporter());
    names.add(AutoConfigureWebFlux.class, "org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration");
    names.add(AutoConfigureWebFlux.class, "org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration");
    names.add(AutoConfigureWebFlux.class, "org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration");
    names.add(AutoConfigureWebFlux.class, "org.springframework.boot.autoconfigure.mustache.MustacheAutoConfiguration");
    names.add(AutoConfigureWebFlux.class, "org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration");
    names.add(AutoConfigureWebFlux.class, "org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration");
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.context.filter._FactoryProvider.excludeFilterContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.json._FactoryProvider.duplicateJsonObjectContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.mock.mockito._FactoryProvider.mockitoContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.web.client._FactoryProvider.testRestTemplateContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.web.reactive.server._FactoryProvider.webTestClientContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.autoconfigure.actuate.metrics._FactoryProvider.metricsExportContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.autoconfigure.properties._FactoryProvider.propertyMappingContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.boot.test.autoconfigure.web.servlet._FactoryProvider.webDriverContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.test.context.web.socket._FactoryProvider.mockServerContainerContextCustomizerFactory());
    factories.add(ContextCustomizerFactory.class, () -> org.springframework.test.context.support._FactoryProvider.dynamicPropertiesContextCustomizerFactory());
    factories.add(DatabaseInitializerDetector.class, () -> org.springframework.boot.flyway._FactoryProvider.flywayDatabaseInitializerDetector());
    factories.add(DatabaseInitializerDetector.class, () -> org.springframework.boot.jdbc._FactoryProvider.abstractDataSourceInitializerDatabaseInitializerDetector());
    factories.add(DatabaseInitializerDetector.class, () -> org.springframework.boot.jdbc.init._FactoryProvider.dataSourceScriptDatabaseInitializerDetector());
    factories.add(DatabaseInitializerDetector.class, () -> org.springframework.boot.liquibase._FactoryProvider.liquibaseDatabaseInitializerDetector());
    names.add(DatabaseInitializerDetector.class, "org.springframework.boot.orm.jpa.JpaDatabaseInitializerDetector");
    factories.add(DatabaseInitializerDetector.class, () -> org.springframework.boot.r2dbc.init._FactoryProvider.r2dbcScriptDatabaseInitializerDetector());
    factories.add(DatabaseInitializerDetector.class, () -> org.springframework.boot.autoconfigure.flyway._FactoryProvider.flywayMigrationInitializerDatabaseInitializerDetector());
    names.add(AutoConfigureJson.class, "org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration");
    names.add(AutoConfigureJson.class, "org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration");
    names.add(AutoConfigureJson.class, "org.springframework.boot.autoconfigure.jsonb.JsonbAutoConfiguration");
    names.add(AutoConfigureWebServiceClient.class, "org.springframework.boot.test.autoconfigure.webservices.client.WebServiceClientTemplateAutoConfiguration");
    names.add(AutoConfigureWebServiceClient.class, "org.springframework.boot.autoconfigure.webservices.client.WebServiceTemplateAutoConfiguration");
    names.add(SpringBootExceptionReporter.class, "org.springframework.boot.diagnostics.FailureAnalyzers");
    factories.add(org.springframework.boot.env.PropertySourceLoader.class, () -> new org.springframework.boot.env.PropertiesPropertySourceLoader());
    factories.add(org.springframework.boot.env.PropertySourceLoader.class, () -> new org.springframework.boot.env.YamlPropertySourceLoader());
    names.add(TestExecutionListener.class, "org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener");
    names.add(TestExecutionListener.class, "org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener");
    names.add(TestExecutionListener.class, "org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener");
    names.add(TestExecutionListener.class, "org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener");
    names.add(TestExecutionListener.class, "org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener");
    names.add(TestExecutionListener.class, "org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener");
    names.add(TestExecutionListener.class, "org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener");
    names.add(TestExecutionListener.class, "org.springframework.test.context.web.ServletTestExecutionListener");
    names.add(TestExecutionListener.class, "org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener");
    names.add(TestExecutionListener.class, "org.springframework.test.context.event.ApplicationEventsTestExecutionListener");
    names.add(TestExecutionListener.class, "org.springframework.aot.test.AotDependencyInjectionTestExecutionListener");
    names.add(TestExecutionListener.class, "org.springframework.test.context.support.DirtiesContextTestExecutionListener");
    names.add(TestExecutionListener.class, "org.springframework.test.context.transaction.TransactionalTestExecutionListener");
    names.add(TestExecutionListener.class, "org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener");
    names.add(TestExecutionListener.class, "org.springframework.test.context.event.EventPublishingTestExecutionListener");
    names.add(AutoConfigureDataJdbc.class, "org.springframework.boot.autoconfigure.data.jdbc.JdbcRepositoriesAutoConfiguration");
    names.add(AutoConfigureDataJdbc.class, "org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration");
    names.add(AutoConfigureDataJdbc.class, "org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration");
    names.add(AutoConfigureDataJdbc.class, "org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration");
    names.add(AutoConfigureDataJdbc.class, "org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration");
    names.add(AutoConfigureDataJdbc.class, "org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration");
    names.add(AutoConfigureDataJdbc.class, "org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration");
    names.add(AutoConfigureDataJdbc.class, "org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration");
    names.add(AutoConfigureJdbc.class, "org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration");
    names.add(AutoConfigureJdbc.class, "org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration");
    names.add(AutoConfigureJdbc.class, "org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration");
    names.add(AutoConfigureJdbc.class, "org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration");
    names.add(AutoConfigureJdbc.class, "org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration");
    names.add(AutoConfigureJdbc.class, "org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration");
    names.add(AutoConfigureJdbc.class, "org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration");
    names.add(AutoConfigureWebClient.class, "org.springframework.boot.test.autoconfigure.web.client.WebClientRestTemplateAutoConfiguration");
    names.add(AutoConfigureWebClient.class, "org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration");
    names.add(AutoConfigureWebClient.class, "org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration");
    names.add(AutoConfigureWebClient.class, "org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration");
    names.add(AutoConfigureWebClient.class, "org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration");
    names.add(AutoConfigureWebClient.class, "org.springframework.boot.autoconfigure.jsonb.JsonbAutoConfiguration");
    names.add(AutoConfigureWebClient.class, "org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration");
    names.add(AutoConfigureWebClient.class, "org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration");
    names.add(AutoConfigureWebTestClient.class, "org.springframework.boot.autoconfigure.security.oauth2.client.reactive.ReactiveOAuth2ClientAutoConfiguration");
    names.add(AutoConfigureWebTestClient.class, "org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration");
    names.add(AutoConfigureWebTestClient.class, "org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration");
    names.add(AutoConfigureWebTestClient.class, "org.springframework.boot.test.autoconfigure.web.reactive.WebTestClientAutoConfiguration");
    names.add(AutoConfigureCache.class, "org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.hateoas.HypermediaAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.jsonb.JsonbAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.mustache.MustacheAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration");
    names.add(AutoConfigureWebMvc.class, "org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration");
    names.add(AutoConfigureTestEntityManager.class, "org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManagerAutoConfiguration");
    names.add(ConfigDataLocationResolver.class, "org.springframework.boot.context.config.ConfigTreeConfigDataLocationResolver");
    names.add(ConfigDataLocationResolver.class, "org.springframework.boot.context.config.StandardConfigDataLocationResolver");
    factories.add(DefaultTestExecutionListenersPostProcessor.class, () -> org.springframework.boot.test.autoconfigure._FactoryProvider.springBootDependencyInjectionTestExecutionListenerPostProcessor());
    names.add(AutoConfigureRestDocs.class, "org.springframework.boot.test.autoconfigure.restdocs.RestDocsAutoConfiguration");
    names.add(AutoConfigureMockMvc.class, "org.springframework.boot.test.autoconfigure.web.servlet.MockMvcAutoConfiguration");
    names.add(AutoConfigureMockMvc.class, "org.springframework.boot.test.autoconfigure.web.servlet.MockMvcWebClientAutoConfiguration");
    names.add(AutoConfigureMockMvc.class, "org.springframework.boot.test.autoconfigure.web.servlet.MockMvcWebDriverAutoConfiguration");
    names.add(AutoConfigureMockMvc.class, "org.springframework.boot.autoconfigure.security.oauth2.client.servlet.OAuth2ClientAutoConfiguration");
    names.add(AutoConfigureMockMvc.class, "org.springframework.boot.autoconfigure.security.oauth2.resource.servlet.OAuth2ResourceServerAutoConfiguration");
    names.add(AutoConfigureMockMvc.class, "org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration");
    names.add(AutoConfigureMockMvc.class, "org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration");
    names.add(AutoConfigureMockMvc.class, "org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration");
    names.add(AutoConfigureMockMvc.class, "org.springframework.boot.test.autoconfigure.web.servlet.MockMvcSecurityConfiguration");
    names.add(AutoConfigureMockMvc.class, "org.springframework.boot.test.autoconfigure.web.reactive.WebTestClientAutoConfiguration");
    names.add(AutoConfigureDataMongo.class, "org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration");
    names.add(AutoConfigureDataMongo.class, "org.springframework.boot.autoconfigure.data.mongo.MongoReactiveDataAutoConfiguration");
    names.add(AutoConfigureDataMongo.class, "org.springframework.boot.autoconfigure.data.mongo.MongoReactiveRepositoriesAutoConfiguration");
    names.add(AutoConfigureDataMongo.class, "org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration");
    names.add(AutoConfigureDataMongo.class, "org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration");
    names.add(AutoConfigureDataMongo.class, "org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration");
    names.add(AutoConfigureDataMongo.class, "org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration");
    names.add(AutoConfigureDataMongo.class, "org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration");
    names.add(AutoConfigureDataLdap.class, "org.springframework.boot.autoconfigure.data.ldap.LdapRepositoriesAutoConfiguration");
    names.add(AutoConfigureDataLdap.class, "org.springframework.boot.autoconfigure.ldap.LdapAutoConfiguration");
    names.add(AutoConfigureDataLdap.class, "org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapAutoConfiguration");
    names.add(AutoConfigureJsonTesters.class, "org.springframework.boot.test.autoconfigure.json.JsonTestersAutoConfiguration");
    names.add(AutoConfigureJsonTesters.class, "org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration");
    names.add(AutoConfigureJsonTesters.class, "org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration");
    names.add(AutoConfigureJsonTesters.class, "org.springframework.boot.autoconfigure.jsonb.JsonbAutoConfiguration");
    names.add(AutoConfigureMockWebServiceServer.class, "org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerAutoConfiguration");
    factories.add(org.springframework.beans.BeanInfoFactory.class, () -> new org.springframework.beans.ExtendedBeanInfoFactory());
    names.add(AutoConfigureWebServiceServer.class, "org.springframework.boot.autoconfigure.webservices.WebServicesAutoConfiguration");
    names.add(AutoConfigureDataJpa.class, "org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration");
    names.add(AutoConfigureDataJpa.class, "org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration");
    names.add(AutoConfigureDataJpa.class, "org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration");
    names.add(AutoConfigureDataJpa.class, "org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration");
    names.add(AutoConfigureDataJpa.class, "org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration");
    names.add(AutoConfigureDataJpa.class, "org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration");
    names.add(AutoConfigureDataJpa.class, "org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration");
    names.add(AutoConfigureDataJpa.class, "org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration");
    names.add(AutoConfigureDataJpa.class, "org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration");
    factories.add(org.springframework.boot.context.config.ConfigDataLoader.class, () -> new org.springframework.boot.context.config.ConfigTreeConfigDataLoader());
    factories.add(org.springframework.boot.context.config.ConfigDataLoader.class, () -> new org.springframework.boot.context.config.StandardConfigDataLoader());
    factories.add(org.springframework.boot.actuate.autoconfigure.web.ManagementContextConfiguration.class, () -> new org.springframework.boot.actuate.autoconfigure.endpoint.web.ServletEndpointManagementContextConfiguration());
    factories.add(org.springframework.boot.actuate.autoconfigure.web.ManagementContextConfiguration.class, () -> new org.springframework.boot.actuate.autoconfigure.endpoint.web.servlet.WebMvcEndpointManagementContextConfiguration());
    factories.add(ManagementContextConfiguration.class, () -> org.springframework.boot.actuate.autoconfigure.endpoint.web.jersey._FactoryProvider.jerseyWebEndpointManagementContextConfiguration());
    factories.add(org.springframework.boot.actuate.autoconfigure.web.ManagementContextConfiguration.class, () -> new org.springframework.boot.actuate.autoconfigure.security.servlet.SecurityRequestMatchersManagementContextConfiguration());
    factories.add(org.springframework.boot.actuate.autoconfigure.web.ManagementContextConfiguration.class, () -> new org.springframework.boot.actuate.autoconfigure.web.jersey.JerseySameManagementContextConfiguration());
    factories.add(org.springframework.boot.actuate.autoconfigure.web.ManagementContextConfiguration.class, () -> new org.springframework.boot.actuate.autoconfigure.web.jersey.JerseyChildManagementContextConfiguration());
    factories.add(ManagementContextConfiguration.class, () -> org.springframework.boot.actuate.autoconfigure.web.servlet._FactoryProvider.servletManagementChildContextConfiguration());
    factories.add(ManagementContextConfiguration.class, () -> org.springframework.boot.actuate.autoconfigure.web.servlet._FactoryProvider.webMvcEndpointChildContextConfiguration());
    factories.add(ApplicationListener.class, () -> org.springframework.boot._FactoryProvider.clearCachesApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.builder.ParentContextCloserApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.context.FileEncodingApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.context.config.AnsiOutputApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.context.config.DelegatingApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.context.logging.LoggingApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.boot.env.EnvironmentPostProcessorApplicationListener());
    factories.add(org.springframework.context.ApplicationListener.class, () -> new org.springframework.nativex.NativeListener());
    names.add(SpringApplicationRunListener.class, "org.springframework.boot.context.event.EventPublishingRunListener");
    names.add(AutoConfigureTestDatabase.class, "org.springframework.boot.test.autoconfigure.jdbc.TestDatabaseAutoConfiguration");
    names.add(AutoConfigureTestDatabase.class, "org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration");
    names.add(AutoConfigureDataRedis.class, "org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration");
    names.add(AutoConfigureDataRedis.class, "org.springframework.boot.autoconfigure.data.redis.RedisReactiveAutoConfiguration");
    names.add(AutoConfigureDataRedis.class, "org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration");
    names.add(AutoConfigureDataCassandra.class, "org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration");
    names.add(AutoConfigureDataCassandra.class, "org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration");
    names.add(AutoConfigureDataCassandra.class, "org.springframework.boot.autoconfigure.data.cassandra.CassandraReactiveDataAutoConfiguration");
    names.add(AutoConfigureDataCassandra.class, "org.springframework.boot.autoconfigure.data.cassandra.CassandraReactiveRepositoriesAutoConfiguration");
    names.add(AutoConfigureDataCassandra.class, "org.springframework.boot.autoconfigure.data.cassandra.CassandraRepositoriesAutoConfiguration");
    names.add(EnvironmentPostProcessor.class, "org.springframework.boot.cloud.CloudFoundryVcapEnvironmentPostProcessor");
    names.add(EnvironmentPostProcessor.class, "org.springframework.boot.context.config.ConfigDataEnvironmentPostProcessor");
    names.add(EnvironmentPostProcessor.class, "org.springframework.boot.env.RandomValuePropertySourceEnvironmentPostProcessor");
    factories.add(org.springframework.boot.env.EnvironmentPostProcessor.class, () -> new org.springframework.boot.env.SpringApplicationJsonEnvironmentPostProcessor());
    factories.add(org.springframework.boot.env.EnvironmentPostProcessor.class, () -> new org.springframework.boot.env.SystemEnvironmentPropertySourceEnvironmentPostProcessor());
    factories.add(org.springframework.boot.env.EnvironmentPostProcessor.class, () -> new org.springframework.boot.reactor.DebugAgentEnvironmentPostProcessor());
    factories.add(EnvironmentPostProcessor.class, () -> org.springframework.boot.autoconfigure.integration._FactoryProvider.integrationPropertiesEnvironmentPostProcessor());
    factories.add(EnvironmentPostProcessor.class, () -> org.springframework.boot.test.web._FactoryProvider.springBootTestRandomPortEnvironmentPostProcessor());
    names.add(AutoConfigureDataNeo4j.class, "org.springframework.boot.autoconfigure.neo4j.Neo4jAutoConfiguration");
    names.add(AutoConfigureDataNeo4j.class, "org.springframework.boot.autoconfigure.data.neo4j.Neo4jDataAutoConfiguration");
    names.add(AutoConfigureDataNeo4j.class, "org.springframework.boot.autoconfigure.data.neo4j.Neo4jReactiveDataAutoConfiguration");
    names.add(AutoConfigureDataNeo4j.class, "org.springframework.boot.autoconfigure.data.neo4j.Neo4jReactiveRepositoriesAutoConfiguration");
    names.add(AutoConfigureDataNeo4j.class, "org.springframework.boot.autoconfigure.data.neo4j.Neo4jRepositoriesAutoConfiguration");
    names.add(AutoConfigureDataNeo4j.class, "org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration");
    names.add(AutoConfigureMockWebServiceClient.class, "org.springframework.boot.test.autoconfigure.webservices.server.MockWebServiceClientAutoConfiguration");
    factories.add(DependsOnDatabaseInitializationDetector.class, () -> org.springframework.boot.sql.init.dependency._FactoryProvider.annotationDependsOnDatabaseInitializationDetector());
    factories.add(DependsOnDatabaseInitializationDetector.class, () -> org.springframework.boot.jdbc._FactoryProvider.springJdbcDependsOnDatabaseInitializationDetector());
    factories.add(DependsOnDatabaseInitializationDetector.class, () -> org.springframework.boot.jooq._FactoryProvider.jooqDependsOnDatabaseInitializationDetector());
    names.add(DependsOnDatabaseInitializationDetector.class, "org.springframework.boot.orm.jpa.JpaDependsOnDatabaseInitializationDetector");
    factories.add(DependsOnDatabaseInitializationDetector.class, () -> org.springframework.boot.autoconfigure.batch._FactoryProvider.jobRepositoryDependsOnDatabaseInitializationDetector());
    factories.add(DependsOnDatabaseInitializationDetector.class, () -> org.springframework.boot.autoconfigure.quartz._FactoryProvider.schedulerDependsOnDatabaseInitializationDetector());
    factories.add(DependsOnDatabaseInitializationDetector.class, () -> org.springframework.boot.autoconfigure.session._FactoryProvider.jdbcIndexedSessionRepositoryDependsOnDatabaseInitializationDetector());
  }
}
