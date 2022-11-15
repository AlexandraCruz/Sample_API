package com.company.sampleapi.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

@Data
/*
 * @Data
All together now: A shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields,
and @Setter on all non-final fields, and @RequiredArgsConstructor!
 * */
@Entity
@Table(name = "clientes") /* table name in lower case and plural */
public class Client implements Serializable {
    /*
     * Always implement Serializable interface for Entity classes. Serialization The
     * process of converting an object to a sequence of bytes, to saving or transmit
     * them to memory or db or JSON or XML or when we are working with http sesion
     * serialization is required
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty  /* @NotEmpty tag is only for string data type
	attributes, and @NotNull tag is  for other data types attributes.*/
    private String firstname;

   //@NotEmpty
    @Column
    private String lastname;

    //@NotEmpty
    @Email
    private String email;

   // @NotNull
    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createAt;

    private static final long serialVersionUID = 1L;
    /* class name in Camel case and singular */

    public Client( String firstname,  String lastname,String email, Date createAt )
    {
        this.firstname =	firstname;
        this.lastname	=	lastname;
        this.email		=	email;
        this.createAt	=	createAt;
    }
    public Client( )
    {

    }
}
