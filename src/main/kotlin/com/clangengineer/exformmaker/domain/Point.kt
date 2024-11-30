package com.clangengineer.exformmaker.domain

import javax.validation.constraints.*
import javax.persistence.*
import org.hibernate.annotations.Cache
import org.hibernate.annotations.CacheConcurrencyStrategy

import java.io.Serializable

import com.clangengineer.exformmaker.domain.enumeration.level


/**
 * A Point.
 */
  
@Entity
@Table(name = "point")
  
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
data class Point(

    
              
  
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
        var id: Long? = null,
                  
  
    @get: NotNull
    @get: Size(min = 20, max = 100)
  
  
    @Column(name = "title", length = 100, nullable = false)
        var title: String? = null,
                  
  
    @Column(name = "description")
        var description: String? = null,
                  
  
    @Column(name = "activated")
        var activated: Boolean? = null,
                  
  
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
        var type: level? = null,
            
    // jhipster-needle-entity-add-field - JHipster will add fields here
) :  Serializable {

  
  
    

        // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) return true
      if (other !is Point) return false
      return id != null && other.id != null && id == other.id
    }

    override fun toString(): String {
        return "Point{" +
            "id=" + id +
            ", title='" + title + "'" +
            ", description='" + description + "'" +
            ", activated='" + activated + "'" +
            ", type='" + type + "'" +
            "}";
    }

    companion object {
        private const val serialVersionUID = 1L
            }
}