package com.crio.qeats.exchanges;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;
import com.crio.qeats.dto.Menu;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetMenuResponse {
    @NotNull
    Menu menu;
  
    @NotNull
    int menuResponseType;
  
}
