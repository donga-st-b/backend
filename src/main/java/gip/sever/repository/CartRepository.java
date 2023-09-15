package gip.sever.repository;

import gip.sever.domain.Cart;
import gip.sever.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByMemberId(Long memberId);
    Optional<Cart> findByMember(Member member);
}
