USE controle_estoque;

CREATE TABLE usuario(	
	id_usuario bigint primary key auto_increment,
    usuario varchar(100) not null unique,
    nome_Usuario varchar(100) not null,
    data_nascimento int not null,
    senha varchar(100) not null,
    ultimo_login datetime default '0001-01-01 00:00:00',
    estado boolean not null default true,
    perfil varchar(20) not null default 'PADRAO'
);

CREATE TABLE categoria(
	id_Categoria int primary key auto_increment,
    nome_categoria varchar(100) not null unique,
    descricao varchar(200)
    );
    
CREATE TABLE produto(
	id_produto bigint primary key auto_increment,
    nome_produto varchar(150) not null unique,
    descricao varchar(200),
    preco_produto decimal(10,2) not null,
    quantidade int not null,
    lote_produto bigint,
    id_categoria int not null,
    id_fornecedor bigint not null,
    constraint fk_id_categoria foreign key (id_categoria) references categoria(id_categoria),
    constraint fk_id_fornecedor foreign key (id_fornecedor) references fornecedor(id_fornecedor)
);

CREATE TABLE fornecedor(
	id_fornecedor bigint primary key auto_increment,
    nome_fornecedor varchar(100) not null,
    endereco_fornecedor varchar(200) not null,
    cidade varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(50) not null,
    uf varchar (2) not null,
    tel int not null,
    cnpj varchar(100) not null
);

CREATE TABLE cliente(
	id_cliente bigint primary key auto_increment,
    nome_cliente varchar (200) not null,
    endereco_cliente varchar(200) not null,
    cidade varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(50) not null,
    uf varchar (2) not null,
    tel int not null,
    cnpj varchar(100)
);
CREATE TABLE entrada(
	id_entrada bigint primary key auto_increment,
    data_entrada datetime default '0001-01-01 00:00:00' not null,
    id_produto bigint not null,
    nome_produto varchar(150) not null,
    id_fornecedor bigint not null,
    id_usuario bigint not null,
    lote_produto bigint not null,
    quantidade int not null,
    preco_produto decimal (10,2) not null,
    constraint fk_id_produto foreign key (id_produto) references produto(id_produto),
    constraint fk_nome_produto foreign key (nome_produto) references produto(nome_produto),
    constraint fk_id_fornecedor foreign key (id_fornecedor) references fornecedor(id_fornecedor),
    constraint fk_id_usuario foreign key (id_usuario) references usuario(id_usuario),
    constraint fk_lote_produto foreign key (lote_produto) references produto(lote_produto),
    constraint fk_quantidade foreign key (quantidade) references produto(quantidade),
    constraint fk_preco_produto foreign key (preco_produto) references produto(preco_produto)
);

CREATE TABLE saida(
	id_saida bigint primary key auto_increment,
    data_saida datetime default '0001-01-01 00:00:00',
    preco_saida decimal (10,2) not null,
    id_produto bigint not null,
    nome_produto varchar(150) not null,
    id_cliente bigint not null,
    nome_cliente varchar(150) not null,
    lote_produto bigint not null,
    quantidade int not null,
    id_usuario bigint not null,
    constraint fk_id_produto foreign key (id_produto) references produto(id_produto),
    constraint fk_nome_produto foreign key (nome_produto) references produto(nome_produto),
    constraint fk_id_cliente foreign key (id_cliente) references cliente(id_cliente),
    constraint fk_nome_cliente foreign key (nome_cliente) references cliente(nome_cliente),
    constraint fk_id_usuario foreign key (id_usuario) references usuario(id_usuario),
    constraint fk_lote_produto foreign key (lote_produto) references produto(lote_produto),
    constraint fk_quantidade foreign key (quantidade) references produto(quantidade)
);



