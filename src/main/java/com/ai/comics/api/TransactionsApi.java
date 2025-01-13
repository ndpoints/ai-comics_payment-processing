package com.ai.comics.api;

import com.ai.comics.model.Transaction;
import com.ai.comics.model.TransactionResponse;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-13T13:11:40.803129Z[Etc/UTC]", comments = "Generator version: 7.10.0")
@Validated
@Tag(name = "transactions", description = "the transactions API")
public interface TransactionsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /transactions : Get all transactions
     *
     * @return A list of transactions (status code 200)
     */
    @Operation(
        operationId = "transactionsGet",
        summary = "Get all transactions",
        responses = {
            @ApiResponse(responseCode = "200", description = "A list of transactions", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = TransactionResponse.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/transactions",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<TransactionResponse>> transactionsGet(
        
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"transaction_id\" : 0, \"amount\" : 1.4658129, \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"user_id\" : 6, \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"currency\" : \"currency\", \"status\" : \"status\" }, { \"transaction_id\" : 0, \"amount\" : 1.4658129, \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"user_id\" : 6, \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"currency\" : \"currency\", \"status\" : \"status\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /transactions : Create a new transaction
     *
     * @param transaction  (required)
     * @return Transaction created successfully (status code 201)
     */
    @Operation(
        operationId = "transactionsPost",
        summary = "Create a new transaction",
        responses = {
            @ApiResponse(responseCode = "201", description = "Transaction created successfully")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/transactions",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> transactionsPost(
        @Parameter(name = "Transaction", description = "", required = true) @Valid @RequestBody Transaction transaction
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /transactions/{transactionId} : Delete a transaction by ID
     *
     * @param transactionId  (required)
     * @return Transaction deleted successfully (status code 204)
     */
    @Operation(
        operationId = "transactionsTransactionIdDelete",
        summary = "Delete a transaction by ID",
        responses = {
            @ApiResponse(responseCode = "204", description = "Transaction deleted successfully")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/transactions/{transactionId}"
    )
    
    default ResponseEntity<Void> transactionsTransactionIdDelete(
        @Parameter(name = "transactionId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("transactionId") Integer transactionId
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /transactions/{transactionId} : Get a transaction by ID
     *
     * @param transactionId  (required)
     * @return A single transaction (status code 200)
     */
    @Operation(
        operationId = "transactionsTransactionIdGet",
        summary = "Get a transaction by ID",
        responses = {
            @ApiResponse(responseCode = "200", description = "A single transaction", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TransactionResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/transactions/{transactionId}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<TransactionResponse> transactionsTransactionIdGet(
        @Parameter(name = "transactionId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("transactionId") Integer transactionId
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"transaction_id\" : 0, \"amount\" : 1.4658129, \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"user_id\" : 6, \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"currency\" : \"currency\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /transactions/{transactionId} : Update a transaction by ID
     *
     * @param transactionId  (required)
     * @param transaction  (required)
     * @return Transaction updated successfully (status code 200)
     */
    @Operation(
        operationId = "transactionsTransactionIdPut",
        summary = "Update a transaction by ID",
        responses = {
            @ApiResponse(responseCode = "200", description = "Transaction updated successfully")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/transactions/{transactionId}",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> transactionsTransactionIdPut(
        @Parameter(name = "transactionId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("transactionId") Integer transactionId,
        @Parameter(name = "Transaction", description = "", required = true) @Valid @RequestBody Transaction transaction
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
