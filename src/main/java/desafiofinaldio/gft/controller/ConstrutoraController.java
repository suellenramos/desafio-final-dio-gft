package desafiofinaldio.gft.controller;

import desafiofinaldio.gft.dto.ConstrutoraDTO;
import desafiofinaldio.gft.dto.ConstrutoraResponseDTO;
import desafiofinaldio.gft.model.Construtora;
import desafiofinaldio.gft.repository.ConstrutoraRepository;
import desafiofinaldio.gft.service.ConstrutoraService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Construtoras")
public class ConstrutoraController {

    @Autowired
    private ConstrutoraService construtoraService;

    @Autowired
    private ConstrutoraRepository construtoraRepository;

   public ConstrutoraController(ConstrutoraService construtoraService){
      this.construtoraService = construtoraService;
    }

//    @RequestMapping(value = "/construtora", method = RequestMethod.GET, produces="application/json")
//    public List<Construtora> Get() {
//        return construtoraRepository.findAll();
//    }

    //@ApiOperation(value="Salva uma Construtora")
   // @PostMapping("/construtora")
    @RequestMapping(value = "/constutora", method =  RequestMethod.POST, produces="application/json", consumes="application/json")
    public ResponseEntity<ConstrutoraResponseDTO> salvar(@RequestBody ConstrutoraDTO construtoraDTO){
        Construtora construtora = construtoraService.salvar(construtoraDTO.dtoToModel());
        return new ResponseEntity<>(ConstrutoraResponseDTO.modelToDTO(construtora), HttpStatus.CREATED);
    }
}
