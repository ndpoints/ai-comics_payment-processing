CREATE TABLE payment_processing (
    transaction_id INTEGER NOT NULL UNIQUE,
    user_id INTEGER NOT NULL,
    amount DECIMAL(10,2) NOT NULL,
    currency VARCHAR(3) NOT NULL,
    status VARCHAR(50) NOT NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME,
    PRIMARY KEY (transaction_id)
);

CREATE INDEX idx_user_id ON payment_processing(user_id);

INSERT INTO payment_processing (transaction_id, user_id, amount, currency, status, created_at) VALUES
(1, 101, 19.99, 'USD', 'completed', NOW()),
(2, 102, 9.99, 'EUR', 'pending', NOW()),
(3, 103, 29.99, 'USD', 'completed', NOW());