
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

public class Post extends ModelWithId<Post, IDatabases> implements Comparable<Post>{
  
  public static final long serialVersionUID = -399049548729901546L;

  public static final String _TABLE_NAME = "posts";

  public static final ModelField ID = ModelField.key(Post.class);
  public static final ModelField TITLE = ModelField.field(Post.class, _Fields.title, String.class);
  public static final ModelField POSTED_AT_MILLIS = ModelField.field(Post.class, _Fields.posted_at_millis, Long.class);
  public static final ModelField USER_ID = ModelField.field(Post.class, _Fields.user_id, Integer.class);
  public static final ModelField UPDATED_AT = ModelField.field(Post.class, _Fields.updated_at, Long.class);

  public static final Set<ModelField> _ALL_MODEL_FIELDS = Sets.newHashSet(ID, TITLE, POSTED_AT_MILLIS, USER_ID, UPDATED_AT);

  private final Attributes attributes;

  private transient Post.Id cachedTypedId;

  // Associations
  private BelongsToAssociation<User> __assoc_user;
  private HasManyAssociation<Comment> __assoc_comments;

  public enum _Fields {
    title,
    posted_at_millis,
    user_id,
    updated_at,
  }

  @Override
  public Post.Id getTypedId() {
    if (cachedTypedId == null) {
      cachedTypedId = new Post.Id(this.getId());
    }
    return cachedTypedId;
  }

  public Post(long id, final String title, final Long posted_at_millis, final Integer user_id, final Long updated_at, IDatabases databases) {
    super(databases);
    attributes = new Attributes(id, title, posted_at_millis, user_id, updated_at);
    this.__assoc_user = new BelongsToAssociation<User>(databases.getDatabase1().users(), getUserId() == null ? null : getUserId().longValue());
    this.__assoc_comments = new HasManyAssociation<Comment>(databases.getDatabase1().comments(), "commented_on_id", getId());
  }

  public Post(long id, final String title, final Long posted_at_millis, final Integer user_id, final Long updated_at) {
    super(null);
    attributes = new Attributes(id, title, posted_at_millis, user_id, updated_at);
  }
  
  public Post(long id, IDatabases databases) {
    super(databases);
    attributes = new Attributes(id);
    this.__assoc_user = new BelongsToAssociation<User>(databases.getDatabase1().users(), getUserId() == null ? null : getUserId().longValue());
    this.__assoc_comments = new HasManyAssociation<Comment>(databases.getDatabase1().comments(), "commented_on_id", getId());
  }

  public Post(long id) {
    super(null);
    attributes = new Attributes(id);
  }

  public static Post newDefaultInstance(long id) {
    return new Post(id);
  }

  public Post(Attributes attributes, IDatabases databases) {
    super(databases);
    this.attributes = attributes;
  }

  public Post(Attributes attributes) {
    super(null);
    this.attributes = attributes;
  }

  public Post(long id, Map<Enum, Object> fieldsMap) {
    super(null);
    attributes = new Attributes(id, fieldsMap);
  }

  public Post (Post other) {
    this(other, (IDatabases)null);
  }

  public Post (Post other, IDatabases databases) {
    super(databases);
    attributes = new Attributes(other.getAttributes());

    if (databases != null) {
      this.__assoc_user = new BelongsToAssociation<User>(databases.getDatabase1().users(), getUserId() == null ? null : getUserId().longValue());
      this.__assoc_comments = new HasManyAssociation<Comment>(databases.getDatabase1().comments(), "commented_on_id", getId());
    }
  }
  
  public Attributes getAttributes() {
    return attributes;
  }

  public String getTitle(){
    return attributes.getTitle();
  }

  public Post setTitle(String newval){
    attributes.setTitle(newval);
    cachedHashCode = 0;
    return this;
  }

  public Long getPostedAtMillis(){
    return attributes.getPostedAtMillis();
  }

  public Post setPostedAtMillis(Long newval){
    attributes.setPostedAtMillis(newval);
    cachedHashCode = 0;
    return this;
  }

  public Integer getUserId(){
    return attributes.getUserId();
  }

  public Post setUserId(Integer newval){
    attributes.setUserId(newval);
    if(__assoc_user != null){
      this.__assoc_user.setOwnerId(newval);
    }
    cachedHashCode = 0;
    return this;
  }

  public Long getUpdatedAt(){
    return attributes.getUpdatedAt();
  }

  public Post setUpdatedAt(Long newval){
    attributes.setUpdatedAt(newval);
    cachedHashCode = 0;
    return this;
  }

  public void setField(_Fields field, Object value) {
    switch (field) {
      case title:
        setTitle((String) value);
        break;
      case posted_at_millis:
        setPostedAtMillis((Long) value);
        break;
      case user_id:
        setUserId((Integer) value);
        break;
      case updated_at:
        setUpdatedAt((Long) value);
        break;
      default:
        throw new IllegalStateException("Invalid field: " + field);
    }
  }
  
  public void setField(String fieldName, Object value) {
    if (fieldName.equals("title")) {
      setTitle((String)  value);
      return;
    }
    if (fieldName.equals("posted_at_millis")) {
      setPostedAtMillis((Long)  value);
      return;
    }
    if (fieldName.equals("user_id")) {
      setUserId((Integer)  value);
      return;
    }
    if (fieldName.equals("updated_at")) {
      setUpdatedAt((Long)  value);
      return;
    }
    throw new IllegalStateException("Invalid field: " + fieldName);
  }

  public static Class getFieldType(_Fields field) {
    switch (field) {
      case title:
        return String.class;
      case posted_at_millis:
        return Long.class;
      case user_id:
        return Integer.class;
      case updated_at:
        return Long.class;
      default:
        throw new IllegalStateException("Invalid field: " + field);
    }    
  }

  public static Class getFieldType(String fieldName) {    
    if (fieldName.equals("title")) {
      return String.class;
    }
    if (fieldName.equals("posted_at_millis")) {
      return Long.class;
    }
    if (fieldName.equals("user_id")) {
      return Integer.class;
    }
    if (fieldName.equals("updated_at")) {
      return Long.class;
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  public User getUser() throws IOException {
    return __assoc_user.get();
  }

  public Set<Comment> getComments() throws IOException {
    return __assoc_comments.get();
  }

  @Override
  public Object getField(String fieldName) {
    if (fieldName.equals("id")) {
      return getId();
    }
    if (fieldName.equals("title")) {
      return getTitle();
    }
    if (fieldName.equals("posted_at_millis")) {
      return getPostedAtMillis();
    }
    if (fieldName.equals("user_id")) {
      return getUserId();
    }
    if (fieldName.equals("updated_at")) {
      return getUpdatedAt();
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  public Object getField(_Fields field) {
    switch (field) {
      case title:
        return getTitle();
      case posted_at_millis:
        return getPostedAtMillis();
      case user_id:
        return getUserId();
      case updated_at:
        return getUpdatedAt();
    }
    throw new IllegalStateException("Invalid field: " + field);
  }
  
  public boolean hasField(String fieldName) {
    if (fieldName.equals("id")) {
      return true;
    }
    if (fieldName.equals("title")) {
      return true;
    }
    if (fieldName.equals("posted_at_millis")) {
      return true;
    }
    if (fieldName.equals("user_id")) {
      return true;
    }
    if (fieldName.equals("updated_at")) {
      return true;
    }
    return false;
  }

  public static Object getDefaultValue(_Fields field) {
    switch (field) {
      case title:
        return null;
      case posted_at_millis:
        return null;
      case user_id:
        return null;
      case updated_at:
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
  public Post getCopy() {
    return getCopy(databases);
  }

  @Override
  public Post getCopy(IDatabases databases) {
    return new Post(this, databases);
  }

  @Override
  public boolean save() throws IOException {
    return databases.getDatabase1().posts().save(this);
  }

  public User createUser(final String handle, final int num_posts) throws IOException {
 
    User newUser = databases.getDatabase1().users().create(handle, num_posts);
    setUserId(safeLongToInt(newUser.getId()));
    save();
    __assoc_user.clearCache();
    return newUser;
  }

  public User createUser(final String handle, final Long created_at_millis, final int num_posts, final Long some_date, final Long some_datetime, final String bio, final byte[] some_binary, final Double some_float, final Double some_decimal, final Boolean some_boolean) throws IOException {
 
    User newUser = databases.getDatabase1().users().create(handle, created_at_millis, num_posts, some_date, some_datetime, bio, some_binary, some_float, some_decimal, some_boolean);
    setUserId(safeLongToInt(newUser.getId()));
    save();
    __assoc_user.clearCache();
    return newUser;
  }

  public User createUser() throws IOException {
 
    User newUser = databases.getDatabase1().users().create("", 0);
    setUserId(safeLongToInt(newUser.getId()));
    save();
    __assoc_user.clearCache();
    return newUser;
  }

  public String toString() {
    return "<Post"
      + " title: " + getTitle()
      + " posted_at_millis: " + getPostedAtMillis()
      + " user_id: " + getUserId()
      + " updated_at: " + getUpdatedAt()
      + ">";
  }

  public void unsetAssociations() {
    unsetDatabaseReference();
    __assoc_user = null;
    __assoc_comments = null;
  }

  public int compareTo(Post that){
    return Long.valueOf(this.getId()).compareTo(that.getId());
  }
  
  
  public static class Attributes extends AttributesWithId {
    
    public static final long serialVersionUID = -452436965662476312L;

    // Fields
    private String __title;
    private Long __posted_at_millis;
    private Integer __user_id;
    private Long __updated_at;

    public Attributes(long id) {
      super(id);
    }

    public Attributes(long id, final String title, final Long posted_at_millis, final Integer user_id, final Long updated_at) {
      super(id);
      this.__title = title;
      this.__posted_at_millis = posted_at_millis;
      this.__user_id = user_id;
      this.__updated_at = updated_at;
    }

    public static Attributes newDefaultInstance(long id) {
      return new Attributes(id);
    }

    public Attributes(long id, Map<Enum, Object> fieldsMap) {
      super(id);
      String title = (String) fieldsMap.get(Post._Fields.title);
      Long posted_at_millis = (Long) fieldsMap.get(Post._Fields.posted_at_millis);
      Integer user_id = (Integer) fieldsMap.get(Post._Fields.user_id);
      Long updated_at = (Long) fieldsMap.get(Post._Fields.updated_at);
      this.__title = title;
      this.__posted_at_millis = posted_at_millis;
      this.__user_id = user_id;
      this.__updated_at = updated_at;
    }

    public Attributes(Attributes other) {
      super(other.getId());
      this.__title = other.getTitle();
      this.__posted_at_millis = other.getPostedAtMillis();
      this.__user_id = other.getUserId();
      this.__updated_at = other.getUpdatedAt();
    }

    public String getTitle(){
      return __title;
    }

    public Attributes setTitle(String newval){
      this.__title = newval;
      cachedHashCode = 0;
      return this;
    }

    public Long getPostedAtMillis(){
      return __posted_at_millis;
    }

    public Attributes setPostedAtMillis(Long newval){
      this.__posted_at_millis = newval;
      cachedHashCode = 0;
      return this;
    }

    public Integer getUserId(){
      return __user_id;
    }

    public Attributes setUserId(Integer newval){
      this.__user_id = newval;
      cachedHashCode = 0;
      return this;
    }

    public Long getUpdatedAt(){
      return __updated_at;
    }

    public Attributes setUpdatedAt(Long newval){
      this.__updated_at = newval;
      cachedHashCode = 0;
      return this;
    }

    public void setField(_Fields field, Object value) {
      switch (field) {
        case title:
          setTitle((String) value);
          break;
        case posted_at_millis:
          setPostedAtMillis((Long) value);
          break;
        case user_id:
          setUserId((Integer) value);
          break;
        case updated_at:
          setUpdatedAt((Long) value);
          break;
        default:
          throw new IllegalStateException("Invalid field: " + field);
      }
    }

    public void setField(String fieldName, Object value) {
      if (fieldName.equals("title")) {
        setTitle((String)  value);
        return;
      }
      if (fieldName.equals("posted_at_millis")) {
        setPostedAtMillis((Long)  value);
        return;
      }
      if (fieldName.equals("user_id")) {
        setUserId((Integer)  value);
        return;
      }
      if (fieldName.equals("updated_at")) {
        setUpdatedAt((Long)  value);
        return;
      }
      throw new IllegalStateException("Invalid field: " + fieldName);
    }

    public static Class getFieldType(_Fields field) {
      switch (field) {
        case title:
          return String.class;
        case posted_at_millis:
          return Long.class;
        case user_id:
          return Integer.class;
        case updated_at:
          return Long.class;
        default:
          throw new IllegalStateException("Invalid field: " + field);
      }    
    }

    public static Class getFieldType(String fieldName) {    
      if (fieldName.equals("title")) {
        return String.class;
      }
      if (fieldName.equals("posted_at_millis")) {
        return Long.class;
      }
      if (fieldName.equals("user_id")) {
        return Integer.class;
      }
      if (fieldName.equals("updated_at")) {
        return Long.class;
      }
      throw new IllegalStateException("Invalid field name: " + fieldName);
    }

    @Override
    public Object getField(String fieldName) {
      if (fieldName.equals("id")) {
        return getId();
      }
      if (fieldName.equals("title")) {
        return getTitle();
      }
      if (fieldName.equals("posted_at_millis")) {
        return getPostedAtMillis();
      }
      if (fieldName.equals("user_id")) {
        return getUserId();
      }
      if (fieldName.equals("updated_at")) {
        return getUpdatedAt();
      }
      throw new IllegalStateException("Invalid field name: " + fieldName);
    }

    public Object getField(_Fields field) {
      switch (field) {
        case title:
          return getTitle();
        case posted_at_millis:
          return getPostedAtMillis();
        case user_id:
          return getUserId();
        case updated_at:
          return getUpdatedAt();
      }
      throw new IllegalStateException("Invalid field: " + field);
    }

    public boolean hasField(String fieldName) {
      if (fieldName.equals("id")) {
        return true;
      }
      if (fieldName.equals("title")) {
        return true;
      }
      if (fieldName.equals("posted_at_millis")) {
        return true;
      }
      if (fieldName.equals("user_id")) {
        return true;
      }
      if (fieldName.equals("updated_at")) {
        return true;
      }
      return false;
    }

    public static Object getDefaultValue(_Fields field) {
      switch (field) {
        case title:
          return null;
        case posted_at_millis:
          return null;
        case user_id:
          return null;
        case updated_at:
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
      return "<Post.Attributes"
        + " title: " + getTitle()
        + " posted_at_millis: " + getPostedAtMillis()
        + " user_id: " + getUserId()
        + " updated_at: " + getUpdatedAt()
        + ">";
    }
  }

  public static class Id implements ModelIdWrapper<Post.Id> {
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
      return "<Post.Id: "+this.getId()+">";
    }
  }

  public static Set<Attributes> convertToAttributesSet(Set<Post> models) {
    Set<Attributes> attributes = new HashSet<Attributes>();
    for (Post model : models) {
      attributes.add(model.getAttributes());
    }
    return attributes;
  }

}
