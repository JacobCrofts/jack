
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project.database_1.models;

import java.io.IOException;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Sets;

import com.rapleaf.jack.test_project.database_1.IDatabase1;

import com.rapleaf.jack.ModelField;
import com.rapleaf.jack.ModelWithId;
import com.rapleaf.jack.AttributesWithId;
import com.rapleaf.jack.BelongsToAssociation;
import com.rapleaf.jack.HasManyAssociation;
import com.rapleaf.jack.HasOneAssociation;
import com.rapleaf.jack.ModelIdWrapper;

import com.rapleaf.jack.test_project.IDatabases;

public class User extends ModelWithId<User, IDatabases> implements Comparable<User>{
  
  public static final long serialVersionUID = -966057050205502149L;

  public static final String _TABLE_NAME = "users";

  public static final ModelField ID = ModelField.key(User.class);
  public static final ModelField HANDLE = ModelField.field(User.class, _Fields.handle, String.class);
  public static final ModelField CREATED_AT_MILLIS = ModelField.field(User.class, _Fields.created_at_millis, Long.class);
  public static final ModelField NUM_POSTS = ModelField.field(User.class, _Fields.num_posts, Integer.class);
  public static final ModelField SOME_DATE = ModelField.field(User.class, _Fields.some_date, Long.class);
  public static final ModelField SOME_DATETIME = ModelField.field(User.class, _Fields.some_datetime, Long.class);
  public static final ModelField BIO = ModelField.field(User.class, _Fields.bio, String.class);
  public static final ModelField SOME_BINARY = ModelField.field(User.class, _Fields.some_binary, byte[].class);
  public static final ModelField SOME_FLOAT = ModelField.field(User.class, _Fields.some_float, Double.class);
  public static final ModelField SOME_DECIMAL = ModelField.field(User.class, _Fields.some_decimal, Double.class);
  public static final ModelField SOME_BOOLEAN = ModelField.field(User.class, _Fields.some_boolean, Boolean.class);

  public static final Set<ModelField> _ALL_MODEL_FIELDS = Sets.newHashSet(ID, HANDLE, CREATED_AT_MILLIS, NUM_POSTS, SOME_DATE, SOME_DATETIME, BIO, SOME_BINARY, SOME_FLOAT, SOME_DECIMAL, SOME_BOOLEAN);

  private final Attributes attributes;

  private transient User.Id cachedTypedId;

  // Associations
  private HasManyAssociation<Post> __assoc_posts;
  private HasManyAssociation<Comment> __assoc_comments;
  private HasOneAssociation<Image> __assoc_image;

  public enum _Fields {
    handle,
    created_at_millis,
    num_posts,
    some_date,
    some_datetime,
    bio,
    some_binary,
    some_float,
    some_decimal,
    some_boolean,
  }

  @Override
  public User.Id getTypedId() {
    if (cachedTypedId == null) {
      cachedTypedId = new User.Id(this.getId());
    }
    return cachedTypedId;
  }

  public User(long id, final String handle, final Long created_at_millis, final int num_posts, final Long some_date, final Long some_datetime, final String bio, final byte[] some_binary, final Double some_float, final Double some_decimal, final Boolean some_boolean, IDatabases databases) {
    super(databases);
    attributes = new Attributes(id, handle, created_at_millis, num_posts, some_date, some_datetime, bio, some_binary, some_float, some_decimal, some_boolean);
    this.__assoc_posts = new HasManyAssociation<Post>(databases.getDatabase1().posts(), "user_id", getId());
    this.__assoc_comments = new HasManyAssociation<Comment>(databases.getDatabase1().comments(), "commenter_id", getId());
    this.__assoc_image = new HasOneAssociation<Image>(databases.getDatabase1().images(), "user_id", getId());
  }

  public User(long id, final String handle, final Long created_at_millis, final int num_posts, final Long some_date, final Long some_datetime, final String bio, final byte[] some_binary, final Double some_float, final Double some_decimal, final Boolean some_boolean) {
    super(null);
    attributes = new Attributes(id, handle, created_at_millis, num_posts, some_date, some_datetime, bio, some_binary, some_float, some_decimal, some_boolean);
  }
  
  public User(long id, final String handle, final int num_posts, IDatabases databases) {
    super(databases);
    attributes = new Attributes(id, handle, num_posts);
    this.__assoc_posts = new HasManyAssociation<Post>(databases.getDatabase1().posts(), "user_id", getId());
    this.__assoc_comments = new HasManyAssociation<Comment>(databases.getDatabase1().comments(), "commenter_id", getId());
    this.__assoc_image = new HasOneAssociation<Image>(databases.getDatabase1().images(), "user_id", getId());
  }

  public User(long id, final String handle, final int num_posts) {
    super(null);
    attributes = new Attributes(id, handle, num_posts);
  }

  public static User newDefaultInstance(long id) {
    return new User(id, "", 0);
  }

  public User(Attributes attributes, IDatabases databases) {
    super(databases);
    this.attributes = attributes;
  }

  public User(Attributes attributes) {
    super(null);
    this.attributes = attributes;
  }

  public User(long id, Map<Enum, Object> fieldsMap) {
    super(null);
    attributes = new Attributes(id, fieldsMap);
  }

  public User (User other) {
    this(other, (IDatabases)null);
  }

  public User (User other, IDatabases databases) {
    super(databases);
    attributes = new Attributes(other.getAttributes());

    if (databases != null) {
      this.__assoc_posts = new HasManyAssociation<Post>(databases.getDatabase1().posts(), "user_id", getId());
      this.__assoc_comments = new HasManyAssociation<Comment>(databases.getDatabase1().comments(), "commenter_id", getId());
      this.__assoc_image = new HasOneAssociation<Image>(databases.getDatabase1().images(), "user_id", getId());
    }
  }
  
  public Attributes getAttributes() {
    return attributes;
  }

  public String getHandle(){
    return attributes.getHandle();
  }

  public User setHandle(String newval){
    attributes.setHandle(newval);
    cachedHashCode = 0;
    return this;
  }

  public Long getCreatedAtMillis(){
    return attributes.getCreatedAtMillis();
  }

  public User setCreatedAtMillis(Long newval){
    attributes.setCreatedAtMillis(newval);
    cachedHashCode = 0;
    return this;
  }

  public int getNumPosts(){
    return attributes.getNumPosts();
  }

  public User setNumPosts(int newval){
    attributes.setNumPosts(newval);
    cachedHashCode = 0;
    return this;
  }

  public Long getSomeDate(){
    return attributes.getSomeDate();
  }

  public User setSomeDate(Long newval){
    attributes.setSomeDate(newval);
    cachedHashCode = 0;
    return this;
  }

  public Long getSomeDatetime(){
    return attributes.getSomeDatetime();
  }

  public User setSomeDatetime(Long newval){
    attributes.setSomeDatetime(newval);
    cachedHashCode = 0;
    return this;
  }

  public String getBio(){
    return attributes.getBio();
  }

  public User setBio(String newval){
    attributes.setBio(newval);
    cachedHashCode = 0;
    return this;
  }

  public byte[] getSomeBinary(){
    return attributes.getSomeBinary();
  }

  public User setSomeBinary(byte[] newval){
    attributes.setSomeBinary(newval);
    cachedHashCode = 0;
    return this;
  }

  public Double getSomeFloat(){
    return attributes.getSomeFloat();
  }

  public User setSomeFloat(Double newval){
    attributes.setSomeFloat(newval);
    cachedHashCode = 0;
    return this;
  }

  public Double getSomeDecimal(){
    return attributes.getSomeDecimal();
  }

  public User setSomeDecimal(Double newval){
    attributes.setSomeDecimal(newval);
    cachedHashCode = 0;
    return this;
  }

  public Boolean isSomeBoolean(){
    return attributes.isSomeBoolean();
  }

  public User setSomeBoolean(Boolean newval){
    attributes.setSomeBoolean(newval);
    cachedHashCode = 0;
    return this;
  }

  public void setField(_Fields field, Object value) {
    switch (field) {
      case handle:
        setHandle((String) value);
        break;
      case created_at_millis:
        setCreatedAtMillis((Long) value);
        break;
      case num_posts:
        setNumPosts((Integer) value);
        break;
      case some_date:
        setSomeDate((Long) value);
        break;
      case some_datetime:
        setSomeDatetime((Long) value);
        break;
      case bio:
        setBio((String) value);
        break;
      case some_binary:
        setSomeBinary((byte[]) value);
        break;
      case some_float:
        setSomeFloat((Double) value);
        break;
      case some_decimal:
        setSomeDecimal((Double) value);
        break;
      case some_boolean:
        setSomeBoolean((Boolean) value);
        break;
      default:
        throw new IllegalStateException("Invalid field: " + field);
    }
  }
  
  public void setField(String fieldName, Object value) {
    if (fieldName.equals("handle")) {
      setHandle((String)  value);
      return;
    }
    if (fieldName.equals("created_at_millis")) {
      setCreatedAtMillis((Long)  value);
      return;
    }
    if (fieldName.equals("num_posts")) {
      setNumPosts((Integer)  value);
      return;
    }
    if (fieldName.equals("some_date")) {
      setSomeDate((Long)  value);
      return;
    }
    if (fieldName.equals("some_datetime")) {
      setSomeDatetime((Long)  value);
      return;
    }
    if (fieldName.equals("bio")) {
      setBio((String)  value);
      return;
    }
    if (fieldName.equals("some_binary")) {
      setSomeBinary((byte[])  value);
      return;
    }
    if (fieldName.equals("some_float")) {
      setSomeFloat((Double)  value);
      return;
    }
    if (fieldName.equals("some_decimal")) {
      setSomeDecimal((Double)  value);
      return;
    }
    if (fieldName.equals("some_boolean")) {
      setSomeBoolean((Boolean)  value);
      return;
    }
    throw new IllegalStateException("Invalid field: " + fieldName);
  }

  public static Class getFieldType(_Fields field) {
    switch (field) {
      case handle:
        return String.class;
      case created_at_millis:
        return Long.class;
      case num_posts:
        return int.class;
      case some_date:
        return Long.class;
      case some_datetime:
        return Long.class;
      case bio:
        return String.class;
      case some_binary:
        return byte[].class;
      case some_float:
        return Double.class;
      case some_decimal:
        return Double.class;
      case some_boolean:
        return Boolean.class;
      default:
        throw new IllegalStateException("Invalid field: " + field);
    }    
  }

  public static Class getFieldType(String fieldName) {    
    if (fieldName.equals("handle")) {
      return String.class;
    }
    if (fieldName.equals("created_at_millis")) {
      return Long.class;
    }
    if (fieldName.equals("num_posts")) {
      return int.class;
    }
    if (fieldName.equals("some_date")) {
      return Long.class;
    }
    if (fieldName.equals("some_datetime")) {
      return Long.class;
    }
    if (fieldName.equals("bio")) {
      return String.class;
    }
    if (fieldName.equals("some_binary")) {
      return byte[].class;
    }
    if (fieldName.equals("some_float")) {
      return Double.class;
    }
    if (fieldName.equals("some_decimal")) {
      return Double.class;
    }
    if (fieldName.equals("some_boolean")) {
      return Boolean.class;
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  public Set<Post> getPosts() throws IOException {
    return __assoc_posts.get();
  }

  public Set<Comment> getComments() throws IOException {
    return __assoc_comments.get();
  }

  public Image getImage() throws IOException {
    return __assoc_image.get();
  }

  @Override
  public Object getField(String fieldName) {
    if (fieldName.equals("id")) {
      return getId();
    }
    if (fieldName.equals("handle")) {
      return getHandle();
    }
    if (fieldName.equals("created_at_millis")) {
      return getCreatedAtMillis();
    }
    if (fieldName.equals("num_posts")) {
      return getNumPosts();
    }
    if (fieldName.equals("some_date")) {
      return getSomeDate();
    }
    if (fieldName.equals("some_datetime")) {
      return getSomeDatetime();
    }
    if (fieldName.equals("bio")) {
      return getBio();
    }
    if (fieldName.equals("some_binary")) {
      return getSomeBinary();
    }
    if (fieldName.equals("some_float")) {
      return getSomeFloat();
    }
    if (fieldName.equals("some_decimal")) {
      return getSomeDecimal();
    }
    if (fieldName.equals("some_boolean")) {
      return isSomeBoolean();
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  public Object getField(_Fields field) {
    switch (field) {
      case handle:
        return getHandle();
      case created_at_millis:
        return getCreatedAtMillis();
      case num_posts:
        return getNumPosts();
      case some_date:
        return getSomeDate();
      case some_datetime:
        return getSomeDatetime();
      case bio:
        return getBio();
      case some_binary:
        return getSomeBinary();
      case some_float:
        return getSomeFloat();
      case some_decimal:
        return getSomeDecimal();
      case some_boolean:
        return isSomeBoolean();
    }
    throw new IllegalStateException("Invalid field: " + field);
  }
  
  public boolean hasField(String fieldName) {
    if (fieldName.equals("id")) {
      return true;
    }
    if (fieldName.equals("handle")) {
      return true;
    }
    if (fieldName.equals("created_at_millis")) {
      return true;
    }
    if (fieldName.equals("num_posts")) {
      return true;
    }
    if (fieldName.equals("some_date")) {
      return true;
    }
    if (fieldName.equals("some_datetime")) {
      return true;
    }
    if (fieldName.equals("bio")) {
      return true;
    }
    if (fieldName.equals("some_binary")) {
      return true;
    }
    if (fieldName.equals("some_float")) {
      return true;
    }
    if (fieldName.equals("some_decimal")) {
      return true;
    }
    if (fieldName.equals("some_boolean")) {
      return true;
    }
    return false;
  }

  public static Object getDefaultValue(_Fields field) {
    switch (field) {
      case handle:
        return null;
      case created_at_millis:
        return null;
      case num_posts:
        return null;
      case some_date:
        return null;
      case some_datetime:
        return null;
      case bio:
        return null;
      case some_binary:
        return null;
      case some_float:
        return null;
      case some_decimal:
        return null;
      case some_boolean:
        return null;
    }
    throw new IllegalStateException("Invalid field: " + field);
  }

  @Override
  public Set<Enum> getFieldSet() {
    Set set = EnumSet.allOf(_Fields.class);
    return set;
  }

  @Override
  public User getCopy() {
    return getCopy(databases);
  }

  @Override
  public User getCopy(IDatabases databases) {
    return new User(this, databases);
  }

  @Override
  public boolean save() throws IOException {
    return databases.getDatabase1().users().save(this);
  }

  public String toString() {
    return "<User"
      + " handle: " + getHandle()
      + " created_at_millis: " + getCreatedAtMillis()
      + " num_posts: " + getNumPosts()
      + " some_date: " + getSomeDate()
      + " some_datetime: " + getSomeDatetime()
      + " bio: " + getBio()
      + " some_binary: " + getSomeBinary()
      + " some_float: " + getSomeFloat()
      + " some_decimal: " + getSomeDecimal()
      + " some_boolean: " + isSomeBoolean()
      + ">";
  }

  public void unsetAssociations() {
    unsetDatabaseReference();
    __assoc_posts = null;
    __assoc_comments = null;
    __assoc_image = null;
  }

  public int compareTo(User that){
    return Long.valueOf(this.getId()).compareTo(that.getId());
  }
  
  
  public static class Attributes extends AttributesWithId {
    
    public static final long serialVersionUID = 7482296567648746981L;

    // Fields
    private String __handle;
    private Long __created_at_millis;
    private int __num_posts;
    private Long __some_date;
    private Long __some_datetime;
    private String __bio;
    private byte[] __some_binary;
    private Double __some_float;
    private Double __some_decimal;
    private Boolean __some_boolean;

    public Attributes(long id) {
      super(id);
    }

    public Attributes(long id, final String handle, final Long created_at_millis, final int num_posts, final Long some_date, final Long some_datetime, final String bio, final byte[] some_binary, final Double some_float, final Double some_decimal, final Boolean some_boolean) {
      super(id);
      this.__handle = handle;
      this.__created_at_millis = created_at_millis;
      this.__num_posts = num_posts;
      this.__some_date = some_date;
      this.__some_datetime = some_datetime;
      this.__bio = bio;
      this.__some_binary = some_binary;
      this.__some_float = some_float;
      this.__some_decimal = some_decimal;
      this.__some_boolean = some_boolean;
    }
    
    public Attributes(long id, final String handle, final int num_posts) {
      super(id);
      this.__handle = handle;
      this.__num_posts = num_posts;
    }

    public static Attributes newDefaultInstance(long id) {
      return new Attributes(id, "", 0);
    }

    public Attributes(long id, Map<Enum, Object> fieldsMap) {
      super(id);
      String handle = (String) fieldsMap.get(User._Fields.handle);
      Long created_at_millis = (Long) fieldsMap.get(User._Fields.created_at_millis);
      int num_posts = (Integer) fieldsMap.get(User._Fields.num_posts);
      Long some_date = (Long) fieldsMap.get(User._Fields.some_date);
      Long some_datetime = (Long) fieldsMap.get(User._Fields.some_datetime);
      String bio = (String) fieldsMap.get(User._Fields.bio);
      byte[] some_binary = (byte[]) fieldsMap.get(User._Fields.some_binary);
      Double some_float = (Double) fieldsMap.get(User._Fields.some_float);
      Double some_decimal = (Double) fieldsMap.get(User._Fields.some_decimal);
      Boolean some_boolean = (Boolean) fieldsMap.get(User._Fields.some_boolean);
      this.__handle = handle;
      this.__created_at_millis = created_at_millis;
      this.__num_posts = num_posts;
      this.__some_date = some_date;
      this.__some_datetime = some_datetime;
      this.__bio = bio;
      this.__some_binary = some_binary;
      this.__some_float = some_float;
      this.__some_decimal = some_decimal;
      this.__some_boolean = some_boolean;
    }

    public Attributes(Attributes other) {
      super(other.getId());
      this.__handle = other.getHandle();
      this.__created_at_millis = other.getCreatedAtMillis();
      this.__num_posts = other.getNumPosts();
      this.__some_date = other.getSomeDate();
      this.__some_datetime = other.getSomeDatetime();
      this.__bio = other.getBio();
      this.__some_binary = copyBinary(other.getSomeBinary());
      this.__some_float = other.getSomeFloat();
      this.__some_decimal = other.getSomeDecimal();
      this.__some_boolean = other.isSomeBoolean();
    }

    public String getHandle(){
      return __handle;
    }

    public Attributes setHandle(String newval){
      this.__handle = newval;
      cachedHashCode = 0;
      return this;
    }

    public Long getCreatedAtMillis(){
      return __created_at_millis;
    }

    public Attributes setCreatedAtMillis(Long newval){
      this.__created_at_millis = newval;
      cachedHashCode = 0;
      return this;
    }

    public int getNumPosts(){
      return __num_posts;
    }

    public Attributes setNumPosts(int newval){
      this.__num_posts = newval;
      cachedHashCode = 0;
      return this;
    }

    public Long getSomeDate(){
      return __some_date;
    }

    public Attributes setSomeDate(Long newval){
      this.__some_date = newval;
      cachedHashCode = 0;
      return this;
    }

    public Long getSomeDatetime(){
      return __some_datetime;
    }

    public Attributes setSomeDatetime(Long newval){
      this.__some_datetime = newval;
      cachedHashCode = 0;
      return this;
    }

    public String getBio(){
      return __bio;
    }

    public Attributes setBio(String newval){
      this.__bio = newval;
      cachedHashCode = 0;
      return this;
    }

    public byte[] getSomeBinary(){
      return __some_binary;
    }

    public Attributes setSomeBinary(byte[] newval){
      this.__some_binary = newval;
      cachedHashCode = 0;
      return this;
    }

    public Double getSomeFloat(){
      return __some_float;
    }

    public Attributes setSomeFloat(Double newval){
      this.__some_float = newval;
      cachedHashCode = 0;
      return this;
    }

    public Double getSomeDecimal(){
      return __some_decimal;
    }

    public Attributes setSomeDecimal(Double newval){
      this.__some_decimal = newval;
      cachedHashCode = 0;
      return this;
    }

    public Boolean isSomeBoolean(){
      return __some_boolean;
    }

    public Attributes setSomeBoolean(Boolean newval){
      this.__some_boolean = newval;
      cachedHashCode = 0;
      return this;
    }

    public void setField(_Fields field, Object value) {
      switch (field) {
        case handle:
          setHandle((String) value);
          break;
        case created_at_millis:
          setCreatedAtMillis((Long) value);
          break;
        case num_posts:
          setNumPosts((Integer) value);
          break;
        case some_date:
          setSomeDate((Long) value);
          break;
        case some_datetime:
          setSomeDatetime((Long) value);
          break;
        case bio:
          setBio((String) value);
          break;
        case some_binary:
          setSomeBinary((byte[]) value);
          break;
        case some_float:
          setSomeFloat((Double) value);
          break;
        case some_decimal:
          setSomeDecimal((Double) value);
          break;
        case some_boolean:
          setSomeBoolean((Boolean) value);
          break;
        default:
          throw new IllegalStateException("Invalid field: " + field);
      }
    }

    public void setField(String fieldName, Object value) {
      if (fieldName.equals("handle")) {
        setHandle((String)  value);
        return;
      }
      if (fieldName.equals("created_at_millis")) {
        setCreatedAtMillis((Long)  value);
        return;
      }
      if (fieldName.equals("num_posts")) {
        setNumPosts((Integer)  value);
        return;
      }
      if (fieldName.equals("some_date")) {
        setSomeDate((Long)  value);
        return;
      }
      if (fieldName.equals("some_datetime")) {
        setSomeDatetime((Long)  value);
        return;
      }
      if (fieldName.equals("bio")) {
        setBio((String)  value);
        return;
      }
      if (fieldName.equals("some_binary")) {
        setSomeBinary((byte[])  value);
        return;
      }
      if (fieldName.equals("some_float")) {
        setSomeFloat((Double)  value);
        return;
      }
      if (fieldName.equals("some_decimal")) {
        setSomeDecimal((Double)  value);
        return;
      }
      if (fieldName.equals("some_boolean")) {
        setSomeBoolean((Boolean)  value);
        return;
      }
      throw new IllegalStateException("Invalid field: " + fieldName);
    }

    public static Class getFieldType(_Fields field) {
      switch (field) {
        case handle:
          return String.class;
        case created_at_millis:
          return Long.class;
        case num_posts:
          return int.class;
        case some_date:
          return Long.class;
        case some_datetime:
          return Long.class;
        case bio:
          return String.class;
        case some_binary:
          return byte[].class;
        case some_float:
          return Double.class;
        case some_decimal:
          return Double.class;
        case some_boolean:
          return Boolean.class;
        default:
          throw new IllegalStateException("Invalid field: " + field);
      }    
    }

    public static Class getFieldType(String fieldName) {    
      if (fieldName.equals("handle")) {
        return String.class;
      }
      if (fieldName.equals("created_at_millis")) {
        return Long.class;
      }
      if (fieldName.equals("num_posts")) {
        return int.class;
      }
      if (fieldName.equals("some_date")) {
        return Long.class;
      }
      if (fieldName.equals("some_datetime")) {
        return Long.class;
      }
      if (fieldName.equals("bio")) {
        return String.class;
      }
      if (fieldName.equals("some_binary")) {
        return byte[].class;
      }
      if (fieldName.equals("some_float")) {
        return Double.class;
      }
      if (fieldName.equals("some_decimal")) {
        return Double.class;
      }
      if (fieldName.equals("some_boolean")) {
        return Boolean.class;
      }
      throw new IllegalStateException("Invalid field name: " + fieldName);
    }

    @Override
    public Object getField(String fieldName) {
      if (fieldName.equals("id")) {
        return getId();
      }
      if (fieldName.equals("handle")) {
        return getHandle();
      }
      if (fieldName.equals("created_at_millis")) {
        return getCreatedAtMillis();
      }
      if (fieldName.equals("num_posts")) {
        return getNumPosts();
      }
      if (fieldName.equals("some_date")) {
        return getSomeDate();
      }
      if (fieldName.equals("some_datetime")) {
        return getSomeDatetime();
      }
      if (fieldName.equals("bio")) {
        return getBio();
      }
      if (fieldName.equals("some_binary")) {
        return getSomeBinary();
      }
      if (fieldName.equals("some_float")) {
        return getSomeFloat();
      }
      if (fieldName.equals("some_decimal")) {
        return getSomeDecimal();
      }
      if (fieldName.equals("some_boolean")) {
        return isSomeBoolean();
      }
      throw new IllegalStateException("Invalid field name: " + fieldName);
    }

    public Object getField(_Fields field) {
      switch (field) {
        case handle:
          return getHandle();
        case created_at_millis:
          return getCreatedAtMillis();
        case num_posts:
          return getNumPosts();
        case some_date:
          return getSomeDate();
        case some_datetime:
          return getSomeDatetime();
        case bio:
          return getBio();
        case some_binary:
          return getSomeBinary();
        case some_float:
          return getSomeFloat();
        case some_decimal:
          return getSomeDecimal();
        case some_boolean:
          return isSomeBoolean();
      }
      throw new IllegalStateException("Invalid field: " + field);
    }

    public boolean hasField(String fieldName) {
      if (fieldName.equals("id")) {
        return true;
      }
      if (fieldName.equals("handle")) {
        return true;
      }
      if (fieldName.equals("created_at_millis")) {
        return true;
      }
      if (fieldName.equals("num_posts")) {
        return true;
      }
      if (fieldName.equals("some_date")) {
        return true;
      }
      if (fieldName.equals("some_datetime")) {
        return true;
      }
      if (fieldName.equals("bio")) {
        return true;
      }
      if (fieldName.equals("some_binary")) {
        return true;
      }
      if (fieldName.equals("some_float")) {
        return true;
      }
      if (fieldName.equals("some_decimal")) {
        return true;
      }
      if (fieldName.equals("some_boolean")) {
        return true;
      }
      return false;
    }

    public static Object getDefaultValue(_Fields field) {
      switch (field) {
        case handle:
          return null;
        case created_at_millis:
          return null;
        case num_posts:
          return null;
        case some_date:
          return null;
        case some_datetime:
          return null;
        case bio:
          return null;
        case some_binary:
          return null;
        case some_float:
          return null;
        case some_decimal:
          return null;
        case some_boolean:
          return null;
      }
      throw new IllegalStateException("Invalid field: " + field);
    }
    
    @Override
    public Set<Enum> getFieldSet() {
      Set set = EnumSet.allOf(_Fields.class);
      return set;
    }
    
    public String toString() {
      return "<User.Attributes"
        + " handle: " + getHandle()
        + " created_at_millis: " + getCreatedAtMillis()
        + " num_posts: " + getNumPosts()
        + " some_date: " + getSomeDate()
        + " some_datetime: " + getSomeDatetime()
        + " bio: " + getBio()
        + " some_binary: " + getSomeBinary()
        + " some_float: " + getSomeFloat()
        + " some_decimal: " + getSomeDecimal()
        + " some_boolean: " + isSomeBoolean()
        + ">";
    }
  }

  public static class Id implements ModelIdWrapper<User.Id> {
    public static final long serialVersionUID = 1L;

    private final long id;

    public Id(Long id) {
      this.id = id;
    }

    @Override
    public Long getId() {
      return Long.valueOf(this.id);
    }

    @Override
    public int compareTo(Id other) {
      return this.getId().compareTo(other.getId());
    }

    @Override
    public boolean equals(Object other) {
      if (other instanceof Id) {
        return this.getId().equals(((Id) other).getId());
      }
      return false;
    }

    @Override
    public int hashCode() {
      return this.getId().hashCode();
    }

    @Override
    public String toString() {
      return "<User.Id: "+this.getId()+">";
    }
  }

  public static Set<Attributes> convertToAttributesSet(Set<User> models) {
    Set<Attributes> attributes = new HashSet<Attributes>();
    for (User model : models) {
      attributes.add(model.getAttributes());
    }
    return attributes;
  }

}
