//package services.phone;
//
//
//import entities.Phone;
//import org.springframework.stereotype.Service;
//import repository.PhoneRepository;
//
//import java.util.List;
//
//@Service
//public class PhoneServiceImp implements PhoneService {
//
//    private PhoneRepository phoneRepository;
//
//    public PhoneServiceImp(PhoneRepository phoneRepository) {
//        this.phoneRepository = phoneRepository;
//    }
//
//    @Override
//    public void save(Phone phone) {
//        phoneRepository.save(phone);
//    }
//
//    @Override
//    public Phone getPhoneById(Long id) {
//        return phoneRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public List<Phone> getAllPhone() {
//        return phoneRepository.findAll();
//    }
//
//    @Override
//    public void deletePhone(Long id) {
//        phoneRepository.deleteById(id);
//    }
//}
