-- deletando as tabelas
drop table java_venda;
drop table java_fornecedor;
drop table java_produto;
drop table java_cliente;
commit;

-- criação da tabela java_cliente
create table java_cliente(
    id_cliente number(10) primary key,
    nome varchar2(50),
    cpf varchar2(11)
    
);
commit;

-- criação da tabela java_vendedor
drop table java_vendedor;
commit;
create table java_vendedor(
    id_vendedor number(10) primary key,
    nome varchar2(50)
);
commit;

-- criação da tabela java_fornecedor
create table java_fornecedor(
    id_fornecedor number(10) primary key,
    nome varchar2(50),
    cnpj varchar2(14)
);
commit;

-- criação da tabela java_produto
create table java_produto(
    id_produto number(10) primary key,
    nome varchar2(50),
    qtd_estoque number(10),
    preco number(10, 2),
    id_fornecedor number(10),
    FOREIGN KEY (id_fornecedor) references java_fornecedor(id_fornecedor)
    ON DELETE CASCADE
);
commit;

-- criação da tabela java_venda
create table java_venda(
    id_venda number(10) primary key,
    id_cliente number(10),
    id_vendedor number(10),
    data Date,
    total number(12, 2),
    FOREIGN KEY(id_cliente) REFERENCES java_cliente(id_cliente),
    FOREIGN KEY(id_vendedor) REFERENCES java_vendedor(id_vendedor)
    ON DELETE CASCADE
);
commit;



