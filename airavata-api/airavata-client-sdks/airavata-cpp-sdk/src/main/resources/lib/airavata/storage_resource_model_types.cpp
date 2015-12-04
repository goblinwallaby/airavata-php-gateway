/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "storage_resource_model_types.h"

#include <algorithm>
#include <ostream>

#include <thrift/TToString.h>

namespace apache { namespace airavata { namespace model { namespace appcatalog { namespace storageresource {


StorageResourceDescription::~StorageResourceDescription() throw() {
}


void StorageResourceDescription::__set_storageResourceId(const std::string& val) {
  this->storageResourceId = val;
}

void StorageResourceDescription::__set_hostName(const std::string& val) {
  this->hostName = val;
}

void StorageResourceDescription::__set_storageResourceDescription(const std::string& val) {
  this->storageResourceDescription = val;
__isset.storageResourceDescription = true;
}

void StorageResourceDescription::__set_enabled(const bool val) {
  this->enabled = val;
__isset.enabled = true;
}

void StorageResourceDescription::__set_dataMovementInterfaces(const std::vector< ::apache::airavata::model::data::movement::DataMovementInterface> & val) {
  this->dataMovementInterfaces = val;
__isset.dataMovementInterfaces = true;
}

const char* StorageResourceDescription::ascii_fingerprint = "CE76BB6921F4C911BE496A0D70B834E8";
const uint8_t StorageResourceDescription::binary_fingerprint[16] = {0xCE,0x76,0xBB,0x69,0x21,0xF4,0xC9,0x11,0xBE,0x49,0x6A,0x0D,0x70,0xB8,0x34,0xE8};

uint32_t StorageResourceDescription::read(::apache::thrift::protocol::TProtocol* iprot) {

  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;

  bool isset_storageResourceId = false;
  bool isset_hostName = false;

  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->storageResourceId);
          isset_storageResourceId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->hostName);
          isset_hostName = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->storageResourceDescription);
          this->__isset.storageResourceDescription = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_BOOL) {
          xfer += iprot->readBool(this->enabled);
          this->__isset.enabled = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 5:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->dataMovementInterfaces.clear();
            uint32_t _size0;
            ::apache::thrift::protocol::TType _etype3;
            xfer += iprot->readListBegin(_etype3, _size0);
            this->dataMovementInterfaces.resize(_size0);
            uint32_t _i4;
            for (_i4 = 0; _i4 < _size0; ++_i4)
            {
              xfer += this->dataMovementInterfaces[_i4].read(iprot);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.dataMovementInterfaces = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  if (!isset_storageResourceId)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_hostName)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  return xfer;
}

uint32_t StorageResourceDescription::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  oprot->incrementRecursionDepth();
  xfer += oprot->writeStructBegin("StorageResourceDescription");

  xfer += oprot->writeFieldBegin("storageResourceId", ::apache::thrift::protocol::T_STRING, 1);
  xfer += oprot->writeString(this->storageResourceId);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("hostName", ::apache::thrift::protocol::T_STRING, 2);
  xfer += oprot->writeString(this->hostName);
  xfer += oprot->writeFieldEnd();

  if (this->__isset.storageResourceDescription) {
    xfer += oprot->writeFieldBegin("storageResourceDescription", ::apache::thrift::protocol::T_STRING, 3);
    xfer += oprot->writeString(this->storageResourceDescription);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.enabled) {
    xfer += oprot->writeFieldBegin("enabled", ::apache::thrift::protocol::T_BOOL, 4);
    xfer += oprot->writeBool(this->enabled);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.dataMovementInterfaces) {
    xfer += oprot->writeFieldBegin("dataMovementInterfaces", ::apache::thrift::protocol::T_LIST, 5);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRUCT, static_cast<uint32_t>(this->dataMovementInterfaces.size()));
      std::vector< ::apache::airavata::model::data::movement::DataMovementInterface> ::const_iterator _iter5;
      for (_iter5 = this->dataMovementInterfaces.begin(); _iter5 != this->dataMovementInterfaces.end(); ++_iter5)
      {
        xfer += (*_iter5).write(oprot);
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  oprot->decrementRecursionDepth();
  return xfer;
}

void swap(StorageResourceDescription &a, StorageResourceDescription &b) {
  using ::std::swap;
  swap(a.storageResourceId, b.storageResourceId);
  swap(a.hostName, b.hostName);
  swap(a.storageResourceDescription, b.storageResourceDescription);
  swap(a.enabled, b.enabled);
  swap(a.dataMovementInterfaces, b.dataMovementInterfaces);
  swap(a.__isset, b.__isset);
}

StorageResourceDescription::StorageResourceDescription(const StorageResourceDescription& other6) {
  storageResourceId = other6.storageResourceId;
  hostName = other6.hostName;
  storageResourceDescription = other6.storageResourceDescription;
  enabled = other6.enabled;
  dataMovementInterfaces = other6.dataMovementInterfaces;
  __isset = other6.__isset;
}
StorageResourceDescription& StorageResourceDescription::operator=(const StorageResourceDescription& other7) {
  storageResourceId = other7.storageResourceId;
  hostName = other7.hostName;
  storageResourceDescription = other7.storageResourceDescription;
  enabled = other7.enabled;
  dataMovementInterfaces = other7.dataMovementInterfaces;
  __isset = other7.__isset;
  return *this;
}
std::ostream& operator<<(std::ostream& out, const StorageResourceDescription& obj) {
  using apache::thrift::to_string;
  out << "StorageResourceDescription(";
  out << "storageResourceId=" << to_string(obj.storageResourceId);
  out << ", " << "hostName=" << to_string(obj.hostName);
  out << ", " << "storageResourceDescription="; (obj.__isset.storageResourceDescription ? (out << to_string(obj.storageResourceDescription)) : (out << "<null>"));
  out << ", " << "enabled="; (obj.__isset.enabled ? (out << to_string(obj.enabled)) : (out << "<null>"));
  out << ", " << "dataMovementInterfaces="; (obj.__isset.dataMovementInterfaces ? (out << to_string(obj.dataMovementInterfaces)) : (out << "<null>"));
  out << ")";
  return out;
}

}}}}} // namespace
