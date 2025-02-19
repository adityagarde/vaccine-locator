package dev.vaccinelocator.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.vaccinelocator.enums.VaccineBrand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Session {
  String session_id;
  @JsonProperty(value = "date")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
  Date dateForVaccination;
  int available_capacity;
  int min_age_limit;
  VaccineBrand vaccine;
  List<String> slots;
}
