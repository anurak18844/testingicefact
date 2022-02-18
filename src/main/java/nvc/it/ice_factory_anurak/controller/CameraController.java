package nvc.it.ice_factory_anurak.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nvc.it.ice_factory_anurak.model.Camera;
import nvc.it.ice_factory_anurak.model.Event;
import nvc.it.ice_factory_anurak.service.CameraService;

@RestController
@RequestMapping("/camera")
public class CameraController {
    @Autowired
    private CameraService cameraService;

    @GetMapping("")
    public ResponseEntity<Object> getAllCamera(){
        List<Camera> cameras = cameraService.getAllCamera();
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Get All Camera");
        map.put("data", cameras);
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> getCamearaById(@PathVariable String id){
        // List<Camera> cameras = cameraService.getAllCamera();
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Get Camera By Id");
        map.put("data", cameraService.findById(id));
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> addCamera(@RequestBody Camera camera){
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Add Camera");
        map.put("data", cameraService.addCamera(camera));
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }

    @PatchMapping("/event/{id}")
    public ResponseEntity<Object> addEvent(@PathVariable String id, @RequestBody Event event){
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg", "Add Camera");
        map.put("data", cameraService.addEvent(id,event));
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }
    
}
