CREATE TABLE public.construtora (
	cons_id serial4 NOT NULL,
	cons_descricao varchar NULL,
	CONSTRAINT construtora_pk PRIMARY KEY (cons_id)
);

CREATE TABLE public.cliente (
	cli_id serial4 NOT NULL,
	cons_id int4 NULL,
	cli_nome varchar NULL,
	CONSTRAINT cliente_pk PRIMARY KEY (cli_id),
	CONSTRAINT cliente_fk FOREIGN KEY (cons_id) REFERENCES public.construtora(cons_id)
);

CREATE TABLE public.obras (
	ob_id serial4 NOT NULL,
	ob_descricao varchar NULL,
	cli_id int4 NOT NULL,
	CONSTRAINT obras_pk PRIMARY KEY (ob_id),
	CONSTRAINT obras_fk FOREIGN KEY (cli_id) REFERENCES public.cliente(cli_id)
);

CREATE TABLE public.cotacao_materiais (
	mat_id serial4 NOT NULL,
	mat_descricao varchar NULL,
	mat_valor numeric NULL,
	CONSTRAINT materiais_pk PRIMARY KEY (mat_id)
);

CREATE TABLE public.saldo_construcao (
	sc_id serial4 NOT NULL,
	ob_id int4 NOT NULL,
	sc_saldo_inicial numeric NULL,
	sc_saldo_atual numeric NULL,
	CONSTRAINT saldo_construcao_pk PRIMARY KEY (sc_id),
	CONSTRAINT saldo_construcao_fk FOREIGN KEY (ob_id) REFERENCES public.obras(ob_id)
);

CREATE TABLE public.pedido (
	ped_id serial4 NOT NULL,
	ped_quatidade int2 NOT NULL,
	ped_total_material numeric NOT NULL,
	sc_id int4 NULL,
	CONSTRAINT pedido_pk PRIMARY KEY (ped_id),
	CONSTRAINT pedido_fk FOREIGN KEY (sc_id) REFERENCES public.saldo_construcao(sc_id)
);

CREATE TABLE public.materiais_pedido (
	mat_id int4 NOT NULL,
	ped_id int4 NOT NULL,
	CONSTRAINT materiais_pedido_fk FOREIGN KEY (mat_id) REFERENCES public.cotacao_materiais(mat_id),
	CONSTRAINT materiais_pedido_fk_1 FOREIGN KEY (ped_id) REFERENCES public.pedido(ped_id)
);

ALTER TABLE public.cotacao_materiais ADD mat_unidade varchar NULL;
ALTER TABLE public.cotacao_materiais ADD mat_codigo varchar NULL;

ALTER TABLE public.pedido ADD ped_data date NULL;

ALTER TABLE public.pedido ADD ped_fornecedor varchar NULL;

CREATE TABLE public.contato (
	cont_id serial NOT NULL,
	cont_telefone varchar NULL,
	cont_email varchar NULL,
	cons_id integer NOT NULL,
	CONSTRAINT contato_pk PRIMARY KEY (cont_id),
	CONSTRAINT contato_fk FOREIGN KEY (cons_id) REFERENCES public.construtora(cons_id)
);


