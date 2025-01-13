package com.ai.comics.service;

import com.ai.comics.entity.TransactionEntity;
import com.ai.comics.model.Transaction;
import com.ai.comics.model.TransactionResponse;
import com.ai.comics.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementation of the TransactionService interface.
 */
@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    /**
     * Retrieve all transactions.
     *
     * @return A list of transaction responses.
     * @throws Exception if an error occurs during retrieval.
     */
    @Override
    public List<TransactionResponse> getAllTransactions() throws Exception {
        return transactionRepository.findAll().stream()
                .map(this::convertEntityToModel)
                .collect(Collectors.toList());
    }

    /**
     * Create a new transaction.
     *
     * @param transaction The transaction to create.
     * @throws Exception if an error occurs during creation.
     */
    @Override
    public void createTransaction(Transaction transaction) throws Exception {
        TransactionEntity entity = convertModelToEntity(transaction);
        transactionRepository.save(entity);
    }

    /**
     * Delete a transaction by its ID.
     *
     * @param transactionId The ID of the transaction to delete.
     * @throws Exception if an error occurs during deletion.
     */
    @Override
    public void deleteTransactionById(Integer transactionId) throws Exception {
        transactionRepository.deleteById(transactionId);
    }

    /**
     * Retrieve a transaction by its ID.
     *
     * @param transactionId The ID of the transaction to retrieve.
     * @return The transaction response.
     * @throws Exception if an error occurs during retrieval.
     */
    @Override
    public TransactionResponse getTransactionById(Integer transactionId) throws Exception {
        TransactionEntity entity = transactionRepository.findById(transactionId)
                .orElseThrow(() -> new Exception("Transaction not found"));
        return convertEntityToModel(entity);
    }

    /**
     * Update a transaction by its ID.
     *
     * @param transactionId The ID of the transaction to update.
     * @param transaction The transaction data to update.
     * @throws Exception if an error occurs during update.
     */
    @Override
    public void updateTransactionById(Integer transactionId, Transaction transaction) throws Exception {
        TransactionEntity entity = transactionRepository.findById(transactionId)
                .orElseThrow(() -> new Exception("Transaction not found"));
        entity.setUserId(transaction.getUserId());
        entity.setAmount(transaction.getAmount());
        entity.setCurrency(transaction.getCurrency());
        entity.setStatus(transaction.getStatus());
        entity.setCreatedAt(transaction.getCreatedAt());
        entity.setUpdatedAt(transaction.getUpdatedAt());
        transactionRepository.save(entity);
    }

    /**
     * Convert TransactionEntity to TransactionResponse.
     *
     * @param entity The transaction entity.
     * @return The transaction response.
     */
    private TransactionResponse convertEntityToModel(TransactionEntity entity) {
        TransactionResponse response = new TransactionResponse();
        response.setTransactionId(entity.getTransactionId());
        response.setUserId(entity.getUserId());
        response.setAmount(entity.getAmount());
        response.setCurrency(entity.getCurrency());
        response.setStatus(entity.getStatus());
        response.setCreatedAt(entity.getCreatedAt());
        response.setUpdatedAt(entity.getUpdatedAt());
        return response;
    }

    /**
     * Convert Transaction to TransactionEntity.
     *
     * @param transaction The transaction model.
     * @return The transaction entity.
     */
    private TransactionEntity convertModelToEntity(Transaction transaction) {
        TransactionEntity entity = new TransactionEntity();
        entity.setTransactionId(transaction.getTransactionId());
        entity.setUserId(transaction.getUserId());
        entity.setAmount(transaction.getAmount());
        entity.setCurrency(transaction.getCurrency());
        entity.setStatus(transaction.getStatus());
        entity.setCreatedAt(transaction.getCreatedAt());
        entity.setUpdatedAt(transaction.getUpdatedAt());
        return entity;
    }
}