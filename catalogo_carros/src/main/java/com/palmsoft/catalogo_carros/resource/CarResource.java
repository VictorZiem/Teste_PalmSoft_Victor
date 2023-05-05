package com.palmsoft.catalogo_carros.resource;

import com.palmsoft.catalogo_carros.dto.CarDto;
import com.palmsoft.catalogo_carros.dto.UpdateNameDto;
import com.palmsoft.catalogo_carros.entity.Car;
import com.palmsoft.catalogo_carros.repository.CarRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController //Declara a classe como controlador rest
@RequestMapping("/car") // cria prefixo /car para os endPoints
public class CarResource {

    private CarRepository carRepository; //Declara variavel para repositório

    public CarResource(CarRepository carRepository) {
        this.carRepository = carRepository; //Injeta a variavel repositório
    }

    @GetMapping
    public List<CarDto> getCars() {
        List<Car> cars = carRepository.findAll(); // Recupera todos os objetos do banco
        List<CarDto> carsDto = new ArrayList<>(); // Cria uma lista para dto
        for (int i = 0; i < cars.size(); i++) { // Percorre a lista de carros
            Car car = cars.get(i); // Pega o objeto carro atual
            carsDto.add(new CarDto(car.getNome(), car.getId())); // Cria um dto e adciona a lista
        }
        return carsDto; // retorna a lista
    }

    @GetMapping("/{id}") // Mapeia um novo endPoint get
    public Car getCarById(@PathVariable Long id) {
        return carRepository.findById(id).get();  // Recupera objeto do banco por id
    }

    @PutMapping("/{id}") // Mapeia um novo endPoint put
    public Car update(@RequestBody Car car, @PathVariable Long id) {
        Car old = carRepository.findById(id).get(); // Recupera objeto do banco por id
        car.setId(old.getId()); // Seta o Id para o objeto car recebido
        return carRepository.save(car); // Salva objeto car no banco
    }

    @PatchMapping("/{id}/nome") // Mapeia um novo endPoint patch
    public Car updateNome(@RequestBody UpdateNameDto dto, @PathVariable Long id) {
        Car car = carRepository.findById(id).get();
        car.setNome(dto.getNome()); // Seta o nome do objeto carro
        return carRepository.save(car);
    }

    @PostMapping // Mapeia um novo endPoint post
    public Car insert(@RequestBody Car car) {
        return carRepository.save(car);
    }

    @DeleteMapping("/{id}") // Mapeia um novo endPoint delete
    public void deleteCarById(@PathVariable Long id) {
        Car car = carRepository.findById(id).get();
        if (car.getPreco() != 10) { // Se o preço for igual a 10 não vai deletar
            carRepository.deleteById(id); // Deleta o objeto carro por id no banco
        }

    }

}
