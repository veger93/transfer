//package services.audit;
//
//import entities.Audit;
//import org.springframework.stereotype.Service;
//import repository.AuditRepository;
//
//import java.util.List;
//
//@Service
//public class AuditServiceImp implements AuditService {
//
//    private AuditRepository auditRepository;
//
//    public AuditServiceImp(AuditRepository auditRepository) {
//        this.auditRepository = auditRepository;
//    }
//
//    @Override
//    public void save(Audit audit) {
//        auditRepository.save(audit);
//    }
//
//    @Override
//    public Audit getAuditById(Long id) {
//        return auditRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public List<Audit> getAllAudit() {
//        return auditRepository.findAll();
//    }
//
//    @Override
//    public void deleteAudit(Long id) {
//        auditRepository.deleteById(id);
//    }
//}
