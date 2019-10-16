package com.speedment.example.domainmodel.sakila.sakila.sakila.staff_list.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.domainmodel.sakila.sakila.sakila.staff_list.StaffList;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ShortField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;

/**
 * The generated base for the {@link
 * com.speedment.example.domainmodel.sakila.sakila.sakila.staff_list.StaffList}-interface
 * representing entities of the {@code staff_list}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedStaffList {
    
    /**
     * This Field corresponds to the {@link StaffList} field that can be
     * obtained using the {@link StaffList#getId()} method.
     */
    ShortField<StaffList, Short> ID = ShortField.create(
        Identifier.ID,
        StaffList::getId,
        StaffList::setId,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link StaffList} field that can be
     * obtained using the {@link StaffList#getName()} method.
     */
    StringField<StaffList, String> NAME = StringField.create(
        Identifier.NAME,
        o -> OptionalUtil.unwrap(o.getName()),
        StaffList::setName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link StaffList} field that can be
     * obtained using the {@link StaffList#getAddress()} method.
     */
    StringField<StaffList, String> ADDRESS = StringField.create(
        Identifier.ADDRESS,
        StaffList::getAddress,
        StaffList::setAddress,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link StaffList} field that can be
     * obtained using the {@link StaffList#getZipCode()} method.
     */
    StringField<StaffList, String> ZIP_CODE = StringField.create(
        Identifier.ZIP_CODE,
        o -> OptionalUtil.unwrap(o.getZipCode()),
        StaffList::setZipCode,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link StaffList} field that can be
     * obtained using the {@link StaffList#getPhone()} method.
     */
    StringField<StaffList, String> PHONE = StringField.create(
        Identifier.PHONE,
        StaffList::getPhone,
        StaffList::setPhone,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link StaffList} field that can be
     * obtained using the {@link StaffList#getCity()} method.
     */
    StringField<StaffList, String> CITY = StringField.create(
        Identifier.CITY,
        StaffList::getCity,
        StaffList::setCity,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link StaffList} field that can be
     * obtained using the {@link StaffList#getCountry()} method.
     */
    StringField<StaffList, String> COUNTRY = StringField.create(
        Identifier.COUNTRY,
        StaffList::getCountry,
        StaffList::setCountry,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link StaffList} field that can be
     * obtained using the {@link StaffList#getSid()} method.
     */
    ShortField<StaffList, Short> SID = ShortField.create(
        Identifier.SID,
        StaffList::getSid,
        StaffList::setSid,
        TypeMapper.primitive(),
        false
    );
    
    /**
     * Returns the id of this StaffList. The id field corresponds to the
     * database column sakila.sakila.staff_list.ID.
     * 
     * @return the id of this StaffList
     */
    short getId();
    
    /**
     * Returns the name of this StaffList. The name field corresponds to the
     * database column sakila.sakila.staff_list.name.
     * 
     * @return the name of this StaffList
     */
    Optional<String> getName();
    
    /**
     * Returns the address of this StaffList. The address field corresponds to
     * the database column sakila.sakila.staff_list.address.
     * 
     * @return the address of this StaffList
     */
    String getAddress();
    
    /**
     * Returns the zipCode of this StaffList. The zipCode field corresponds to
     * the database column sakila.sakila.staff_list.zip code.
     * 
     * @return the zipCode of this StaffList
     */
    Optional<String> getZipCode();
    
    /**
     * Returns the phone of this StaffList. The phone field corresponds to the
     * database column sakila.sakila.staff_list.phone.
     * 
     * @return the phone of this StaffList
     */
    String getPhone();
    
    /**
     * Returns the city of this StaffList. The city field corresponds to the
     * database column sakila.sakila.staff_list.city.
     * 
     * @return the city of this StaffList
     */
    String getCity();
    
    /**
     * Returns the country of this StaffList. The country field corresponds to
     * the database column sakila.sakila.staff_list.country.
     * 
     * @return the country of this StaffList
     */
    String getCountry();
    
    /**
     * Returns the sid of this StaffList. The sid field corresponds to the
     * database column sakila.sakila.staff_list.SID.
     * 
     * @return the sid of this StaffList
     */
    short getSid();
    
    /**
     * Sets the id of this StaffList. The id field corresponds to the database
     * column sakila.sakila.staff_list.ID.
     * 
     * @param id to set of this StaffList
     * @return   this StaffList instance
     */
    StaffList setId(short id);
    
    /**
     * Sets the name of this StaffList. The name field corresponds to the
     * database column sakila.sakila.staff_list.name.
     * 
     * @param name to set of this StaffList
     * @return     this StaffList instance
     */
    StaffList setName(String name);
    
    /**
     * Sets the address of this StaffList. The address field corresponds to the
     * database column sakila.sakila.staff_list.address.
     * 
     * @param address to set of this StaffList
     * @return        this StaffList instance
     */
    StaffList setAddress(String address);
    
    /**
     * Sets the zipCode of this StaffList. The zipCode field corresponds to the
     * database column sakila.sakila.staff_list.zip code.
     * 
     * @param zipCode to set of this StaffList
     * @return        this StaffList instance
     */
    StaffList setZipCode(String zipCode);
    
    /**
     * Sets the phone of this StaffList. The phone field corresponds to the
     * database column sakila.sakila.staff_list.phone.
     * 
     * @param phone to set of this StaffList
     * @return      this StaffList instance
     */
    StaffList setPhone(String phone);
    
    /**
     * Sets the city of this StaffList. The city field corresponds to the
     * database column sakila.sakila.staff_list.city.
     * 
     * @param city to set of this StaffList
     * @return     this StaffList instance
     */
    StaffList setCity(String city);
    
    /**
     * Sets the country of this StaffList. The country field corresponds to the
     * database column sakila.sakila.staff_list.country.
     * 
     * @param country to set of this StaffList
     * @return        this StaffList instance
     */
    StaffList setCountry(String country);
    
    /**
     * Sets the sid of this StaffList. The sid field corresponds to the database
     * column sakila.sakila.staff_list.SID.
     * 
     * @param sid to set of this StaffList
     * @return    this StaffList instance
     */
    StaffList setSid(short sid);
    
    enum Identifier implements ColumnIdentifier<StaffList> {
        
        ID       ("ID"),
        NAME     ("name"),
        ADDRESS  ("address"),
        ZIP_CODE ("zip code"),
        PHONE    ("phone"),
        CITY     ("city"),
        COUNTRY  ("country"),
        SID      ("SID");
        
        private final String columnId;
        private final TableIdentifier<StaffList> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "sakila";
        }
        
        @Override
        public String getSchemaId() {
            return "sakila";
        }
        
        @Override
        public String getTableId() {
            return "staff_list";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<StaffList> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}