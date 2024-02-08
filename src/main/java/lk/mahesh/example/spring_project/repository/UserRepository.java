package lk.mahesh.example.spring_project.repository;

import lk.mahesh.example.spring_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
