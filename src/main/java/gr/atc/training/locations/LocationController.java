package gr.atc.training.locations;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/")
public class LocationController {

	@Autowired
	private LocationService locationService;

	@GetMapping("/prefectureUnits/{prefectureCode}")
	public ResponseEntity<List<PrefectureUnit>> getPrefectureUnitsByPrefecture(@PathVariable String prefectureCode) {
	    List<PrefectureUnit> prefectureUnits = locationService.getPrefectureUnitsByPrefecture(prefectureCode);
		return ResponseEntity.ok(prefectureUnits);
	}

	@GetMapping("/municipalities/{prefectureUnitCode}")
	public ResponseEntity<List<Municipality>> getMunicipalitiesByPrefectureUnit(@PathVariable String prefectureUnitCode) {
	    List<Municipality> municipalities = locationService.getMunicipalitiesByPrefectureUnit(prefectureUnitCode);
		return ResponseEntity.ok(municipalities);
	}

	@GetMapping("/municipalityUnits/{municipalityCode}")
	public ResponseEntity<List<MunicipalityUnit>> getMunicipalityUnitsByMunicipality(@PathVariable String municipalityCode) {
	    List<MunicipalityUnit> municipalityUnits = locationService.getMunicipalityUnitsByMunicipality(municipalityCode);
		return ResponseEntity.ok(municipalityUnits);
	}
}

