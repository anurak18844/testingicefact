package nvc.it.ice_factory_anurak.model;
import java.util.Date;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Event {
    private int amount;
    
    private Date createdAt;
    
}
