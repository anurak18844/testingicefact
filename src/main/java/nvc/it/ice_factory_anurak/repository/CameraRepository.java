package nvc.it.ice_factory_anurak.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import nvc.it.ice_factory_anurak.model.Camera;

public interface CameraRepository extends MongoRepository<Camera, String>{

}
