/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.11).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Projecte;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-22T16:17:54.505Z")

@Api(value = "projecte", description = "the projecte API")
public interface ProjecteApi {

    @ApiOperation(value = "afegeix un projecte a la base de dades", nickname = "addProjecte", notes = "Afegeix un projecte al sistema", tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "item creat"),
        @ApiResponse(code = 400, message = "dades invalides, objecte invalid"),
        @ApiResponse(code = 409, message = "aquest projecte ja existeix") })
    @RequestMapping(value = "/projecte",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addProjecte(@ApiParam(value = "Instancia de projecte afegit"  )  @Valid @RequestBody Projecte objecteProjecte);


    @ApiOperation(value = "Buscar projectes per nom", nickname = "findProjecte", notes = "Retorna array de projectes amb aquell nom", response = Projecte.class, responseContainer = "List", tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Tot correcte", response = Projecte.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Projecte no trobat") })
    @RequestMapping(value = "/projecte/findByNom",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Projecte>> findProjecte(@NotNull @ApiParam(value = "Filtrar per nom", required = true) @Valid @RequestParam(value = "nom", required = true) String nom);


    @ApiOperation(value = "Cerca projecte per ID", nickname = "getProjecteById", notes = "Retorna un unic projecte", response = Projecte.class, tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Tot correcte", response = Projecte.class),
        @ApiResponse(code = 400, message = "Id invalida"),
        @ApiResponse(code = 404, message = "Projecte no trobat") })
    @RequestMapping(value = "/projecte/{idProjecte}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Projecte> getProjecteById(@ApiParam(value = "ID del projecte a retornar",required=true) @PathVariable("idProjecte") Integer idProjecte);


    @ApiOperation(value = "cerca tots els projectes", nickname = "getProjectes", notes = "Retorna tots els projectes de la base de dades ", response = Projecte.class, responseContainer = "List", tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retorna correctament tots els projectes", response = Projecte.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Error de conexio") })
    @RequestMapping(value = "/projecte",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Projecte>> getProjectes();


    @ApiOperation(value = "Actualitza un prjecte", nickname = "updateProjecte", notes = "", tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Id no valida"),
        @ApiResponse(code = 404, message = "Projecte no trobat"),
        @ApiResponse(code = 405, message = "Excepcio de validacio") })
    @RequestMapping(value = "/projecte",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateProjecte(@ApiParam(value = "Objecte projecte que sha de modificar" ,required=true )  @Valid @RequestBody Projecte body);

}
