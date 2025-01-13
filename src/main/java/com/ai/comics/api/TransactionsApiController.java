package com.ai.comics.api;

import com.ai.comics.model.Transaction;
import com.ai.comics.model.TransactionResponse;
import com.ai.comics.service.TransactionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@Validated
@RestController
@Tag(name = "transactions", description = "the transactions API")
public class TransactionsApiController implements TransactionsApi {

    private final TransactionService transactionService;

    @Autowired
    public TransactionsApiController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @Override
    public ResponseEntity<List<TransactionResponse>> transactionsGet() throws Exception {
        List<TransactionResponse> transactions = transactionService.getAllTransactions();
        return new ResponseEntity<>(transactions, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> transactionsPost(@Parameter(name = "Transaction", description = "", required = true) @Valid @RequestBody Transaction transaction) throws Exception {
        transactionService.createTransaction(transaction);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> transactionsTransactionIdDelete(@Parameter(name = "transactionId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("transactionId") Integer transactionId) throws Exception {
        transactionService.deleteTransactionById(transactionId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<TransactionResponse> transactionsTransactionIdGet(@Parameter(name = "transactionId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("transactionId") Integer transactionId) throws Exception {
        TransactionResponse transaction = transactionService.getTransactionById(transactionId);
        return new ResponseEntity<>(transaction, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> transactionsTransactionIdPut(@Parameter(name = "transactionId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("transactionId") Integer transactionId,
                                                             @Parameter(name = "Transaction", description = "", required = true) @Valid @RequestBody Transaction transaction) throws Exception {
        transactionService.updateTransactionById(transactionId, transaction);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}