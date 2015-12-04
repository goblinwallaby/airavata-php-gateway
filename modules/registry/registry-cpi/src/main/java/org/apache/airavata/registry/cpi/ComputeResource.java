/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.airavata.registry.cpi;

import org.apache.airavata.model.appcatalog.computeresource.*;
import org.apache.airavata.model.data.movement.*;

import java.util.List;
import java.util.Map;

public interface ComputeResource {
    /**
     * This function will add a compute resource description to the database
     * @param description compute resource description
     * @return unique resource ID generated by airavata
     */
    String addComputeResource (ComputeResourceDescription description) throws AppCatalogException;

    /**
     * This method will update compute resource
     * @param computeResourceId unique compute resource id
     * @param updatedComputeResource updated compute resource
     */
    void updateComputeResource (String computeResourceId, ComputeResourceDescription updatedComputeResource) throws AppCatalogException;
    /**
     * This function will add a SSHJobSubmission to the database
     * @param sshJobSubmission sshJobSubmission object
     * @return unique submission ID generated by airavata
     */
    String addSSHJobSubmission (SSHJobSubmission sshJobSubmission) throws AppCatalogException;


    /**
     * This function will add a SSHJobSubmission to the database
     * @param sshJobSubmission sshJobSubmission object
     * @return unique submission ID generated by airavata
     */
    String addCloudJobSubmission (CloudJobSubmission sshJobSubmission) throws AppCatalogException;


    String addResourceJobManager(ResourceJobManager resourceJobManager) throws AppCatalogException;

    void updateResourceJobManager (String resourceJobManagerId, ResourceJobManager updatedResourceJobManager) throws AppCatalogException;

    ResourceJobManager getResourceJobManager (String resourceJobManagerId) throws AppCatalogException;

    void deleteResourceJobManager (String resourceJobManagerId) throws AppCatalogException;
    
    /**
     * This will add a SSHJobSubmission protocol to the database
     * @param computeResourceId compute resource id
     */
    String addJobSubmissionProtocol(String computeResourceId, JobSubmissionInterface jobSubmissionInterface) throws AppCatalogException;

    String addLocalJobSubmission (LOCALSubmission localSubmission) throws AppCatalogException;

    /**
     * This method will add a GlobusJobSubmission to the database
     * @param globusJobSubmission GSISSHJobSubmission object
     * @return uniquely generated submission id
     */
    String addGlobusJobSubmission (GlobusJobSubmission globusJobSubmission) throws AppCatalogException;

    /**
     * This method will add a UNICOREJobSubmission to the database
     * @param unicoreJobSubmission 
     * @return uniquely generated submission id
     */
    String addUNICOREJobSubmission (UnicoreJobSubmission unicoreJobSubmission) throws AppCatalogException;



    String addLocalDataMovement (LOCALDataMovement localDataMovement) throws AppCatalogException;

    /**
     * This method will add a SCPData movement to the database
     * @param scpDataMovement SCPData movement object
     * @return uniquely generated data move id
     */
    String addScpDataMovement (SCPDataMovement scpDataMovement) throws AppCatalogException;

    String addUnicoreDataMovement (UnicoreDataMovement unicoreDataMovement) throws AppCatalogException;

    /**
     * This will add a SCPDataMovement protocol to the database
     * @param resourceId compute resource id
     */
    String addDataMovementProtocol (String resourceId, DMType dmType, DataMovementInterface dataMovementInterface) throws AppCatalogException;

    /**
     * This method will add a GridFTP Data movement to the database
     * @param gridFTPDataMovement GridFTP Data movement object
     * @return uniquely generated data move id
     */
    String addGridFTPDataMovement (GridFTPDataMovement gridFTPDataMovement) throws AppCatalogException;

    /**
     * This method will retrieve compute resource object on given resource id
     * @param resourceId unique resource id
     * @return ComputeResource object
     */
    ComputeResourceDescription getComputeResource (String resourceId) throws AppCatalogException;

    /**
     * This method will return a list of computeResource descriptions according to given search criteria
     * @param filters map should be provided as the field name and it's value
     * @return list of compute resources
     */
    List<ComputeResourceDescription> getComputeResourceList (Map<String, String> filters) throws AppCatalogException;

    /**
     * This method will retrieve all the compute resources
     * @return list of compute resources
     * @throws AppCatalogException
     */
    List<ComputeResourceDescription> getAllComputeResourceList () throws AppCatalogException;

    /**
     * This method will retrieve all the compute resource id with it's name
     * @return map of compute resource ids + name
     * @throws AppCatalogException
     */
    Map<String, String> getAllComputeResourceIdList () throws AppCatalogException;

    /**
     * This method will retrieve all the enabled compute resource id with it's name
     * @return
     * @throws AppCatalogException
     */
    Map<String, String> getAvailableComputeResourceIdList() throws AppCatalogException;

//    /**
//     * This method will retrieve GlobusJobSubmission object
//     * @param submissionId unique submission id
//     * @return GlobusJobSubmission object
//     */
//    GlobusJobSubmission getGlobusJobSubmission (String submissionId) throws AppCatalogException;
//
//    /**
//     * This method will return a list of GlobusJobSubmission objects according to given search criteria
//     * @param filters map should be provided as the field name and it's value
//     * @return list of GlobusJobSubmission objects
//     */
//    List<GlobusJobSubmission> getGlobusJobSubmissionList (Map<String, String> filters) throws AppCatalogException;

    /**
     * This method will retrieve GSISSHJobSubmission object
     * @param submissionId unique submission id
     * @return GSISSHSubmission object
     */
    SSHJobSubmission getSSHJobSubmission (String submissionId) throws AppCatalogException;
    
    /**
     * This method will retrieve UnicoreJobSubmission object
     * @param submissionId unique submission id
     * @return UnicoreSubmission object
     */
    UnicoreJobSubmission getUNICOREJobSubmission (String submissionId) throws AppCatalogException;
    UnicoreDataMovement getUNICOREDataMovement (String dataMovementId) throws AppCatalogException;

    

    /**
     * This method will retrieve GSISSHJobSubmission object
     * @param submissionId unique submission id
     * @return GSISSHSubmission object
     */
    CloudJobSubmission getCloudJobSubmission (String submissionId) throws AppCatalogException;
//    /**
//     * This method will return a list of GSISSHSubmission objects according to given search criteria
//     * @param filters map should be provided as the field name and it's value
//     * @return list of GSISSHSubmission objects
//     */
//    List<SSHJobSubmission> getSSHJobSubmissionList (Map<String, String> filters) throws AppCatalogException;
    /**
     * This method will retrieve SCP Data movement object
     * @param dataMoveId unique data move id
     * @return SCPDataMovement object
     */
    SCPDataMovement getSCPDataMovement (String dataMoveId) throws AppCatalogException;

//    /**
//     * This method will return a list of SCPDataMovement objects according to given search criteria
//     * @param filters map should be provided as the field name and it's value
//     * @return list of SCPDataMovement objects
//     */
//    List<SCPDataMovement> getSCPDataMovementList (Map<String, String> filters) throws AppCatalogException;

    /**
     * This method will retrieve GridFTPDataMovement object
     * @param dataMoveId unique data move id
     * @return GridFTPDataMovement object
     */
    GridFTPDataMovement getGridFTPDataMovement (String dataMoveId) throws AppCatalogException;

//    /**
//     * This method will return a list of GridFTPDataMovement objects according to given search criteria
//     * @param filters map should be provided as the field name and it's value
//     * @return list of GridFTPDataMovement objects
//     */
//    List<GridFTPDataMovement> getGridFTPDataMovementList (Map<String, String> filters) throws AppCatalogException;

    /**
     * This method will check whether the given resource already exists in the system
     * @param resourceId unique resource id
     * @return true or false
     */
    boolean isComputeResourceExists (String resourceId) throws AppCatalogException;

    /**
     * This method will remove given resource from the system
     * @param resourceId unique resource id
     */
    void removeComputeResource (String resourceId) throws AppCatalogException;

    /**
     * This method will remove job submission interface
     * @param jobSubmissionInterfaceId unique job submission interface id
     * @throws AppCatalogException
     */
    void removeJobSubmissionInterface(String computeResourceId, String jobSubmissionInterfaceId) throws AppCatalogException;

    /**
     * This method will remove data movement interface
     * @param dataMovementInterfaceId unique data movement id
     * @throws AppCatalogException
     */
    void removeDataMovementInterface(String computeResourceId, String dataMovementInterfaceId)  throws AppCatalogException;

    void removeBatchQueue(String computeResourceId, String queueName)  throws AppCatalogException;



    LOCALSubmission getLocalJobSubmission(String submissionId) throws AppCatalogException;
    
    LOCALDataMovement getLocalDataMovement(String datamovementId) throws AppCatalogException;
    
}
