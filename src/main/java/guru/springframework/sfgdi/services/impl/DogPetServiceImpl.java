package guru.springframework.sfgdi.services.impl;

import guru.springframework.sfgdi.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Profile({"dog", "default"})
@Service("petService")
public class DogPetServiceImpl implements PetService {

    public String getPetType(){
        return "Dogs are the best!";
    }
}
