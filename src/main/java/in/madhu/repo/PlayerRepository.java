package in.madhu.repo;

import org.springframework.data.repository.CrudRepository;

import in.madhu.entity.PlayerEntity;

public interface PlayerRepository extends  CrudRepository<PlayerEntity, Integer> {

}
