package guru.springframework.sfgdi.services.impl;

import guru.springframework.sfgdi.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Profile("cat")
@Service("petService")
public class CatPetServiceImpl implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}