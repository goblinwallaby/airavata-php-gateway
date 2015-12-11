<?php
namespace Airavata\Model\Data\Resource;

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;


final class ReplicaLocationCategory {
  const GATEWAY_DATA_STORE = 0;
  const COMPUTE_RESOURCE = 1;
  const LONG_TERM_STORAGE_RESOURCE = 2;
  const OTHER = 3;
  static public $__names = array(
    0 => 'GATEWAY_DATA_STORE',
    1 => 'COMPUTE_RESOURCE',
    2 => 'LONG_TERM_STORAGE_RESOURCE',
    3 => 'OTHER',
  );
}

final class ReplicaPersistentType {
  const TRANSIENT = 0;
  const PERSISTENT = 1;
  static public $__names = array(
    0 => 'TRANSIENT',
    1 => 'PERSISTENT',
  );
}

class DataResourceModel {
  static $_TSPEC;

  /**
   * @var string
   */
  public $resourceId = null;
  /**
   * @var string
   */
  public $resourceName = null;
  /**
   * @var string
   */
  public $resourceDescription = null;
  /**
   * @var string
   */
  public $ownerName = null;
  /**
   * @var int
   */
  public $resourceSize = null;
  /**
   * @var int
   */
  public $creationTime = null;
  /**
   * @var int
   */
  public $lastModifiedTime = null;
  /**
   * @var array
   */
  public $resourceMetadata = null;
  /**
   * @var \Airavata\Model\Data\Resource\DataReplicaLocationModel[]
   */
  public $dataReplicaLocations = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'resourceId',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'resourceName',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'resourceDescription',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'ownerName',
          'type' => TType::STRING,
          ),
        5 => array(
          'var' => 'resourceSize',
          'type' => TType::I32,
          ),
        6 => array(
          'var' => 'creationTime',
          'type' => TType::I64,
          ),
        7 => array(
          'var' => 'lastModifiedTime',
          'type' => TType::I64,
          ),
        8 => array(
          'var' => 'resourceMetadata',
          'type' => TType::MAP,
          'ktype' => TType::STRING,
          'vtype' => TType::STRING,
          'key' => array(
            'type' => TType::STRING,
          ),
          'val' => array(
            'type' => TType::STRING,
            ),
          ),
        9 => array(
          'var' => 'dataReplicaLocations',
          'type' => TType::LST,
          'etype' => TType::STRUCT,
          'elem' => array(
            'type' => TType::STRUCT,
            'class' => '\Airavata\Model\Data\Resource\DataReplicaLocationModel',
            ),
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['resourceId'])) {
        $this->resourceId = $vals['resourceId'];
      }
      if (isset($vals['resourceName'])) {
        $this->resourceName = $vals['resourceName'];
      }
      if (isset($vals['resourceDescription'])) {
        $this->resourceDescription = $vals['resourceDescription'];
      }
      if (isset($vals['ownerName'])) {
        $this->ownerName = $vals['ownerName'];
      }
      if (isset($vals['resourceSize'])) {
        $this->resourceSize = $vals['resourceSize'];
      }
      if (isset($vals['creationTime'])) {
        $this->creationTime = $vals['creationTime'];
      }
      if (isset($vals['lastModifiedTime'])) {
        $this->lastModifiedTime = $vals['lastModifiedTime'];
      }
      if (isset($vals['resourceMetadata'])) {
        $this->resourceMetadata = $vals['resourceMetadata'];
      }
      if (isset($vals['dataReplicaLocations'])) {
        $this->dataReplicaLocations = $vals['dataReplicaLocations'];
      }
    }
  }

  public function getName() {
    return 'DataResourceModel';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->resourceId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->resourceName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->resourceDescription);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->ownerName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->resourceSize);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->creationTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 7:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->lastModifiedTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 8:
          if ($ftype == TType::MAP) {
            $this->resourceMetadata = array();
            $_size0 = 0;
            $_ktype1 = 0;
            $_vtype2 = 0;
            $xfer += $input->readMapBegin($_ktype1, $_vtype2, $_size0);
            for ($_i4 = 0; $_i4 < $_size0; ++$_i4)
            {
              $key5 = '';
              $val6 = '';
              $xfer += $input->readString($key5);
              $xfer += $input->readString($val6);
              $this->resourceMetadata[$key5] = $val6;
            }
            $xfer += $input->readMapEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 9:
          if ($ftype == TType::LST) {
            $this->dataReplicaLocations = array();
            $_size7 = 0;
            $_etype10 = 0;
            $xfer += $input->readListBegin($_etype10, $_size7);
            for ($_i11 = 0; $_i11 < $_size7; ++$_i11)
            {
              $elem12 = null;
              $elem12 = new \Airavata\Model\Data\Resource\DataReplicaLocationModel();
              $xfer += $elem12->read($input);
              $this->dataReplicaLocations []= $elem12;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('DataResourceModel');
    if ($this->resourceId !== null) {
      $xfer += $output->writeFieldBegin('resourceId', TType::STRING, 1);
      $xfer += $output->writeString($this->resourceId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->resourceName !== null) {
      $xfer += $output->writeFieldBegin('resourceName', TType::STRING, 2);
      $xfer += $output->writeString($this->resourceName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->resourceDescription !== null) {
      $xfer += $output->writeFieldBegin('resourceDescription', TType::STRING, 3);
      $xfer += $output->writeString($this->resourceDescription);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->ownerName !== null) {
      $xfer += $output->writeFieldBegin('ownerName', TType::STRING, 4);
      $xfer += $output->writeString($this->ownerName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->resourceSize !== null) {
      $xfer += $output->writeFieldBegin('resourceSize', TType::I32, 5);
      $xfer += $output->writeI32($this->resourceSize);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->creationTime !== null) {
      $xfer += $output->writeFieldBegin('creationTime', TType::I64, 6);
      $xfer += $output->writeI64($this->creationTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->lastModifiedTime !== null) {
      $xfer += $output->writeFieldBegin('lastModifiedTime', TType::I64, 7);
      $xfer += $output->writeI64($this->lastModifiedTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->resourceMetadata !== null) {
      if (!is_array($this->resourceMetadata)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('resourceMetadata', TType::MAP, 8);
      {
        $output->writeMapBegin(TType::STRING, TType::STRING, count($this->resourceMetadata));
        {
          foreach ($this->resourceMetadata as $kiter13 => $viter14)
          {
            $xfer += $output->writeString($kiter13);
            $xfer += $output->writeString($viter14);
          }
        }
        $output->writeMapEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    if ($this->dataReplicaLocations !== null) {
      if (!is_array($this->dataReplicaLocations)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('dataReplicaLocations', TType::LST, 9);
      {
        $output->writeListBegin(TType::STRUCT, count($this->dataReplicaLocations));
        {
          foreach ($this->dataReplicaLocations as $iter15)
          {
            $xfer += $iter15->write($output);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class DataReplicaLocationModel {
  static $_TSPEC;

  /**
   * @var string
   */
  public $replicaId = null;
  /**
   * @var string
   */
  public $resourceId = null;
  /**
   * @var string
   */
  public $replicaName = null;
  /**
   * @var string
   */
  public $replicaDescription = null;
  /**
   * @var int
   */
  public $creationTime = null;
  /**
   * @var int
   */
  public $lastModifiedTime = null;
  /**
   * @var int
   */
  public $replicaLocationCategory = null;
  /**
   * @var int
   */
  public $replicaPersistentType = null;
  /**
   * @var string[]
   */
  public $dataLocations = null;
  /**
   * @var array
   */
  public $replicaMetadata = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'replicaId',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'resourceId',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'replicaName',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'replicaDescription',
          'type' => TType::STRING,
          ),
        5 => array(
          'var' => 'creationTime',
          'type' => TType::I64,
          ),
        6 => array(
          'var' => 'lastModifiedTime',
          'type' => TType::I64,
          ),
        7 => array(
          'var' => 'replicaLocationCategory',
          'type' => TType::I32,
          ),
        8 => array(
          'var' => 'replicaPersistentType',
          'type' => TType::I32,
          ),
        9 => array(
          'var' => 'dataLocations',
          'type' => TType::LST,
          'etype' => TType::STRING,
          'elem' => array(
            'type' => TType::STRING,
            ),
          ),
        10 => array(
          'var' => 'replicaMetadata',
          'type' => TType::MAP,
          'ktype' => TType::STRING,
          'vtype' => TType::STRING,
          'key' => array(
            'type' => TType::STRING,
          ),
          'val' => array(
            'type' => TType::STRING,
            ),
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['replicaId'])) {
        $this->replicaId = $vals['replicaId'];
      }
      if (isset($vals['resourceId'])) {
        $this->resourceId = $vals['resourceId'];
      }
      if (isset($vals['replicaName'])) {
        $this->replicaName = $vals['replicaName'];
      }
      if (isset($vals['replicaDescription'])) {
        $this->replicaDescription = $vals['replicaDescription'];
      }
      if (isset($vals['creationTime'])) {
        $this->creationTime = $vals['creationTime'];
      }
      if (isset($vals['lastModifiedTime'])) {
        $this->lastModifiedTime = $vals['lastModifiedTime'];
      }
      if (isset($vals['replicaLocationCategory'])) {
        $this->replicaLocationCategory = $vals['replicaLocationCategory'];
      }
      if (isset($vals['replicaPersistentType'])) {
        $this->replicaPersistentType = $vals['replicaPersistentType'];
      }
      if (isset($vals['dataLocations'])) {
        $this->dataLocations = $vals['dataLocations'];
      }
      if (isset($vals['replicaMetadata'])) {
        $this->replicaMetadata = $vals['replicaMetadata'];
      }
    }
  }

  public function getName() {
    return 'DataReplicaLocationModel';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->replicaId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->resourceId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->replicaName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->replicaDescription);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->creationTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->lastModifiedTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 7:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->replicaLocationCategory);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 8:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->replicaPersistentType);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 9:
          if ($ftype == TType::LST) {
            $this->dataLocations = array();
            $_size16 = 0;
            $_etype19 = 0;
            $xfer += $input->readListBegin($_etype19, $_size16);
            for ($_i20 = 0; $_i20 < $_size16; ++$_i20)
            {
              $elem21 = null;
              $xfer += $input->readString($elem21);
              $this->dataLocations []= $elem21;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 10:
          if ($ftype == TType::MAP) {
            $this->replicaMetadata = array();
            $_size22 = 0;
            $_ktype23 = 0;
            $_vtype24 = 0;
            $xfer += $input->readMapBegin($_ktype23, $_vtype24, $_size22);
            for ($_i26 = 0; $_i26 < $_size22; ++$_i26)
            {
              $key27 = '';
              $val28 = '';
              $xfer += $input->readString($key27);
              $xfer += $input->readString($val28);
              $this->replicaMetadata[$key27] = $val28;
            }
            $xfer += $input->readMapEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('DataReplicaLocationModel');
    if ($this->replicaId !== null) {
      $xfer += $output->writeFieldBegin('replicaId', TType::STRING, 1);
      $xfer += $output->writeString($this->replicaId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->resourceId !== null) {
      $xfer += $output->writeFieldBegin('resourceId', TType::STRING, 2);
      $xfer += $output->writeString($this->resourceId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->replicaName !== null) {
      $xfer += $output->writeFieldBegin('replicaName', TType::STRING, 3);
      $xfer += $output->writeString($this->replicaName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->replicaDescription !== null) {
      $xfer += $output->writeFieldBegin('replicaDescription', TType::STRING, 4);
      $xfer += $output->writeString($this->replicaDescription);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->creationTime !== null) {
      $xfer += $output->writeFieldBegin('creationTime', TType::I64, 5);
      $xfer += $output->writeI64($this->creationTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->lastModifiedTime !== null) {
      $xfer += $output->writeFieldBegin('lastModifiedTime', TType::I64, 6);
      $xfer += $output->writeI64($this->lastModifiedTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->replicaLocationCategory !== null) {
      $xfer += $output->writeFieldBegin('replicaLocationCategory', TType::I32, 7);
      $xfer += $output->writeI32($this->replicaLocationCategory);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->replicaPersistentType !== null) {
      $xfer += $output->writeFieldBegin('replicaPersistentType', TType::I32, 8);
      $xfer += $output->writeI32($this->replicaPersistentType);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->dataLocations !== null) {
      if (!is_array($this->dataLocations)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('dataLocations', TType::LST, 9);
      {
        $output->writeListBegin(TType::STRING, count($this->dataLocations));
        {
          foreach ($this->dataLocations as $iter29)
          {
            $xfer += $output->writeString($iter29);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    if ($this->replicaMetadata !== null) {
      if (!is_array($this->replicaMetadata)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('replicaMetadata', TType::MAP, 10);
      {
        $output->writeMapBegin(TType::STRING, TType::STRING, count($this->replicaMetadata));
        {
          foreach ($this->replicaMetadata as $kiter30 => $viter31)
          {
            $xfer += $output->writeString($kiter30);
            $xfer += $output->writeString($viter31);
          }
        }
        $output->writeMapEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}


