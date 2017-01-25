package com.csra;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureRestDocs(outputDir = "target/asciidoc/snippets")
@SpringBootTest(classes = {ChcsApiApplication.class})
@AutoConfigureMockMvc
public class ChcsApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void createSpringfoxSwaggerJsonForPatient() throws Exception {
		String outputDir = System.getProperty("io.springfox.staticdocs.outputDir").concat("/patient");
		MvcResult mvcResult = this.mockMvc.perform(get("/v2/api-docs?group=Patient")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();

		MockHttpServletResponse response = mvcResult.getResponse();
		String swaggerJson = response.getContentAsString();
		Files.createDirectories(Paths.get(outputDir));
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputDir, "swagger.json"), StandardCharsets.UTF_8)){
			writer.write(swaggerJson);
		}
	}

	@Test
	public void createSpringfoxSwaggerJsonForMedicationOrder() throws Exception {
		String outputDir = System.getProperty("io.springfox.staticdocs.outputDir").concat("/medicationorder");
		MvcResult mvcResult = this.mockMvc.perform(get("/v2/api-docs?group=MedicationOrder")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();

		MockHttpServletResponse response = mvcResult.getResponse();
		String swaggerJson = response.getContentAsString();
		Files.createDirectories(Paths.get(outputDir));
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputDir, "swagger.json"), StandardCharsets.UTF_8)){
			writer.write(swaggerJson);
		}
	}

	@Test
	public void createSpringfoxSwaggerJsonForStub() throws Exception {
		String outputDir = System.getProperty("io.springfox.staticdocs.outputDir").concat("/stub");
		MvcResult mvcResult = this.mockMvc.perform(get("/v2/api-docs?group=stub")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();

		MockHttpServletResponse response = mvcResult.getResponse();
		String swaggerJson = response.getContentAsString();
		Files.createDirectories(Paths.get(outputDir));
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputDir, "swagger.json"), StandardCharsets.UTF_8)){
			writer.write(swaggerJson);
		}
	}

	@Test
	public void createSpringfoxSwaggerJsonForObservation() throws Exception {
		String outputDir = System.getProperty("io.springfox.staticdocs.outputDir").concat("/observation");
		MvcResult mvcResult = this.mockMvc.perform(get("/v2/api-docs?group=Observation")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();

		MockHttpServletResponse response = mvcResult.getResponse();
		String swaggerJson = response.getContentAsString();
		Files.createDirectories(Paths.get(outputDir));
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputDir, "swagger.json"), StandardCharsets.UTF_8)){
			writer.write(swaggerJson);
		}
	}

	@Test
	public void createSpringfoxSwaggerJsonForDeviceMetric() throws Exception {
		String outputDir = System.getProperty("io.springfox.staticdocs.outputDir").concat("/devicemetric");
		MvcResult mvcResult = this.mockMvc.perform(get("/v2/api-docs?group=DeviceMetric")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();

		MockHttpServletResponse response = mvcResult.getResponse();
		String swaggerJson = response.getContentAsString();
		Files.createDirectories(Paths.get(outputDir));
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputDir, "swagger.json"), StandardCharsets.UTF_8)){
			writer.write(swaggerJson);
		}
	}

	@Test
	public void createSpringfoxSwaggerJsonForConformance() throws Exception {
		String outputDir = System.getProperty("io.springfox.staticdocs.outputDir").concat("/conformance");
		MvcResult mvcResult = this.mockMvc.perform(get("/v2/api-docs?group=Conformance")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();

		MockHttpServletResponse response = mvcResult.getResponse();
		String swaggerJson = response.getContentAsString();
		Files.createDirectories(Paths.get(outputDir));
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputDir, "swagger.json"), StandardCharsets.UTF_8)){
			writer.write(swaggerJson);
		}
	}

}
