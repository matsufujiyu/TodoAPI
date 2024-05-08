/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.todoapi.controller;

import com.example.todoapi.model.BadRequestError;
import com.example.todoapi.model.Error;
import com.example.todoapi.model.Todo;
import com.example.todoapi.model.TodoListDTO;
import com.example.todoapi.model.TodoWithoutId;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-08T17:14:28.754630300+09:00[Asia/Tokyo]", comments = "Generator version: 7.5.0")
@Validated
@Tag(name = "Todos", description = "Operations related to todos")
public interface TodosApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /todos : create a new TODO
     *
     * @param todoWithoutId  (required)
     * @return TODO created (status code 201)
     *         or Unauthorized (status code 400)
     */
    @Operation(
        operationId = "createTodo",
        summary = "create a new TODO",
        tags = { "Todos" },
        responses = {
            @ApiResponse(responseCode = "201", description = "TODO created", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Todo.class))
            }),
            @ApiResponse(responseCode = "400", description = "Unauthorized", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BadRequestError.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/todos",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Todo> createTodo(
        @Parameter(name = "TodoWithoutId", description = "", required = true) @Valid @RequestBody TodoWithoutId todoWithoutId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"details\" : \"details\", \"id\" : 0, \"title\" : \"title\", \"userId\" : \"userId\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"invalid-params\" : [ { \"reason\" : \"reason\", \"name\" : \"name\" }, { \"reason\" : \"reason\", \"name\" : \"name\" } ], \"detail\" : \"リクエストが不正です。正しいリクエストでリトライしてください\", \"title\" : \"Bad Request\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /todos : Retrieve list of TODOs
     *
     * @return List of TODOs (status code 200)
     */
    @Operation(
        operationId = "listTodos",
        summary = "Retrieve list of TODOs",
        tags = { "Todos" },
        responses = {
            @ApiResponse(responseCode = "200", description = "List of TODOs", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TodoListDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/todos",
        produces = { "application/json" }
    )
    
    default ResponseEntity<TodoListDTO> listTodos(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"results\" : [ null, null ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /todos/{id} : Retrieve a TODO by ID
     *
     * @param id  (required)
     * @return Single TODO (status code 200)
     *         or Unauthorized (status code 400)
     *         or TODO not found (status code 404)
     */
    @Operation(
        operationId = "showTodo",
        summary = "Retrieve a TODO by ID",
        tags = { "Todos" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Single TODO", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Todo.class))
            }),
            @ApiResponse(responseCode = "400", description = "Unauthorized", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BadRequestError.class))
            }),
            @ApiResponse(responseCode = "404", description = "TODO not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/todos/{id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Todo> showTodo(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"details\" : \"details\", \"id\" : 0, \"title\" : \"title\", \"userId\" : \"userId\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"invalid-params\" : [ { \"reason\" : \"reason\", \"name\" : \"name\" }, { \"reason\" : \"reason\", \"name\" : \"name\" } ], \"detail\" : \"リクエストが不正です。正しいリクエストでリトライしてください\", \"title\" : \"Bad Request\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"error\" : \"Resource Not Found\", \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
