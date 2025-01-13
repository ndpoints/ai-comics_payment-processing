package com.ai.comics.service;

import com.ai.comics.model.Transaction;
import com.ai.comics.model.TransactionResponse;
import java.util.List;

/**
 * Service interface for managing transactions.
 */
public interface TransactionService {

    /**
     * Retrieve all transactions.
     *
     * @return A list of transaction responses.
     * @throws Exception if an error occurs during retrieval.
     */
    List<TransactionResponse> getAllTransactions() throws Exception;

    /**
     * Create a new transaction.
     *
     * @param transaction The transaction to create.
     * @throws Exception if an error occurs during creation.
     */
    void createTransaction(Transaction transaction) throws Exception;

    /**
     * Delete a transaction by its ID.
     *
     * @param transactionId The ID of the transaction to delete.
     * @throws Exception if an error occurs during deletion.
     */
    void deleteTransactionById(Integer transactionId) throws Exception;

    /**
     * Retrieve a transaction by its ID.
     *
     * @param transactionId The ID of the transaction to retrieve.
     * @return The transaction response.
     * @throws Exception if an error occurs during retrieval.
     */
    TransactionResponse getTransactionById(Integer transactionId) throws Exception;

    /**
     * Update a transaction by its ID.
     *
     * @param transactionId The ID of the transaction to update.
     * @param transaction The transaction data to update.
     * @throws Exception if an error occurs during update.
     */
    void updateTransactionById(Integer transactionId, Transaction transaction) throws Exception;
}