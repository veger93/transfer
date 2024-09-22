//package services.card;
//
//
//import entities.Card;
//import org.springframework.stereotype.Service;
//import repository.CardRepository;
//
//import java.util.List;
//@Service
//public class CardServiceImp implements CardService{
//
//    private CardRepository cardRepository;
//
//    public CardServiceImp(CardRepository cardRepository) {
//        this.cardRepository = cardRepository;
//    }
//
//    @Override
//    public void save(Card card) {
//cardRepository.save(card);
//    }
//
//    @Override
//    public Card getCardById(Long id) {
//        return cardRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public List<Card> getAllCard() {
//        return cardRepository.findAll();
//    }
//
//    @Override
//    public void deleteCard(Long id) {
//        cardRepository.deleteById(id);
//    }
//}
