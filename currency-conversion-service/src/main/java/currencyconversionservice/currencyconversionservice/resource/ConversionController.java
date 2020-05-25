package currencyconversionservice.currencyconversionservice.resource;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConversionController {

	
	
	@Autowired
	private FeighRestClient restClient;
	
	@GetMapping("/hi")
	public String hi() {
		return "Hello";
	}

	@GetMapping("/currency-conversion/from/{from}/to/{to}/units/{units}")
	public ConvertedValue getConvertedValue(@PathVariable String from, @PathVariable String to,@PathVariable BigDecimal units) {
		
		
		
		Map<String, String> uriVariables=new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		String url="http://localhost:8000/currency-exchange/from/{from}/to/{to}";
		ResponseEntity<ExchangeValue> forEntity = new RestTemplate().getForEntity(url, ExchangeValue.class, uriVariables);
		ExchangeValue body = forEntity.getBody();
		BigDecimal conversionRate=new BigDecimal(body.getConversionRate());
		BigDecimal convrtedValue=conversionRate.multiply(units);
		ConvertedValue exchangeValue=new ConvertedValue( from,  to, conversionRate, units, convrtedValue,
				body.getPort());
		return exchangeValue;
	}
	
	
	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/units/{units}")
	public ConvertedValue getConvertedValueFeign(@PathVariable String from, @PathVariable String to,@PathVariable BigDecimal units) {
		
		
		
		ExchangeValue exchange = restClient.getExchangeValue(from, to);
		BigDecimal conversionRate=new BigDecimal(exchange.getConversionRate());
		ConvertedValue exchangeValue=new ConvertedValue( from,  to, conversionRate, units, conversionRate.multiply(units),
				exchange.getPort());
		return exchangeValue;
	}
	
}
