
/*
 *
 * * Copyright (c) Crio.Do 2019. All rights reserved
 * 
 *  
 */

package com.crio.qeats.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

// TODO: CRIO_TASK_MODULE_SERIALIZATION
// Implement Restaurant class.
// Complete the class such that it produces the following JSON during serialization.
// {
// "restaurantId": "10",
// "name": "A2B",
// "city": "Hsr Layout",
// "imageUrl": "www.google.com",
// "latitude": 20.027,
// "longitude": 30.0,
// "opensAt": "18:00",
// "closesAt": "23:00",
// "attributes": [
// "Tamil",
// "South Indian"
// ]
// }

@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
public class Restaurant {

    @JsonIgnore
    private String id;
    @NotNull
    private String restaurantId;
    @NotNull
    private String name;
    @NotNull
    private String city;
    @NotNull
    private String imageUrl;
    @NotNull
    private Double latitude;
    @NotNull
    private Double longitude;
    @NotNull
    private String opensAt;
    @NotNull
    private String closesAt;
    @NotNull
    private List<String> attributes;

    public void setRestaurant(
        String id,
        String restaurantId,
        String name,
        String city,
        String imageUrl,
        Double latitude,
        Double longitude,
        String opensAt,
        String closesAt,
        List<String> attributes
    ) {
      this.attributes = attributes;
      this.id = id;
      this.restaurantId = restaurantId;
      this.name = name;
      this.city = city;
      this.imageUrl = imageUrl;
      this.latitude = latitude;
      this.longitude = longitude;
      this.opensAt = opensAt;
      this.closesAt = closesAt;
  
  
    }
  
}

