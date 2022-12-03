package us.dot.its.jpo.geojsonconverter.pojos.geojson.map;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import us.dot.its.jpo.geojsonconverter.pojos.ProcessedValidationMessage;
import us.dot.its.jpo.ode.plugin.j2735.OdePosition3D;

public class MapPropertiesTest {
    @Test
    public void testNodes() {
        List<MapNode> expectedMapNodeList = new ArrayList<MapNode>();
        MapProperties mapProperties = new MapProperties();
        mapProperties.setNodes(expectedMapNodeList);
        assertEquals(expectedMapNodeList, mapProperties.getNodes());
    }

    @Test
    public void testMessageType() {
        String expectedMessageType = "type";
        MapProperties mapProperties = new MapProperties();
        mapProperties.setMessageType(expectedMessageType);
        assertEquals(expectedMessageType, mapProperties.getMessageType());
    }

    @Test
    public void testOdeReceivedAt() {
        ZonedDateTime expectedOdeReceivedAt = Instant.parse("2022-01-01T00:00:00Z").atZone(ZoneId.of("UTC"));
        MapProperties mapProperties = new MapProperties();
        mapProperties.setOdeReceivedAt(expectedOdeReceivedAt);
        assertEquals(expectedOdeReceivedAt, mapProperties.getOdeReceivedAt());
    }

    @Test
    public void testOriginIp() {
        String expectedIp = "10.0.0.1";
        MapProperties mapProperties = new MapProperties();
        mapProperties.setOriginIp(expectedIp);
        assertEquals(expectedIp, mapProperties.getOriginIp());
    }

    @Test
    public void testIntersectionName() {
        String intersectionName = "name";
        MapProperties mapProperties = new MapProperties();
        mapProperties.setIntersectionName(intersectionName);
        assertEquals(intersectionName, mapProperties.getIntersectionName());
    }

    @Test
    public void testRegion() {
        Integer region = 1;
        MapProperties mapProperties = new MapProperties();
        mapProperties.setLaneId(region);
        assertEquals(region, mapProperties.getRegion());
    }

    @Test
    public void testIntersectionId() {
        Integer intersectionId = 1;
        MapProperties mapProperties = new MapProperties();
        mapProperties.setIntersectionId(intersectionId);
        assertEquals(intersectionId, mapProperties.getIntersectionId());
    }

    @Test
    public void testMsgIssueRevision() {
        Integer msgIssueRevision = 1;
        MapProperties mapProperties = new MapProperties();
        mapProperties.setMsgIssueRevision(msgIssueRevision);
        assertEquals(msgIssueRevision, mapProperties.getMsgIssueRevision());
    }

    @Test
    public void testRevision() {
        Integer revision = 1;
        MapProperties mapProperties = new MapProperties();
        mapProperties.setRevision(revision);
        assertEquals(revision, mapProperties.getRevision());
    }

    @Test
    public void testRefPoint() {
        OdePosition3D refPoint = new OdePosition3D();
        MapProperties mapProperties = new MapProperties();
        mapProperties.setRefPoint(refPoint);
        assertEquals(refPoint, mapProperties.getRefPoint());
    }

    @Test
    public void testCti4501Conformant() {
        Boolean cti4501Conformant = true;
        MapProperties mapProperties = new MapProperties();
        mapProperties.setCti4501Conformant(cti4501Conformant);
        assertEquals(cti4501Conformant, mapProperties.getCti4501Conformant());
    }

    @Test
    public void testValidationMessages() {
        List<ProcessedValidationMessage> validationMessages = new ArrayList<ProcessedValidationMessage>();
        MapProperties mapProperties = new MapProperties();
        mapProperties.setValidationMessages(validationMessages);
        assertEquals(cti4501Conformant, mapProperties.getCti4501Conformant());
    }






    @Test
    public void testLaneId() {
        Integer expectedLaneId = 3;
        MapProperties mapProperties = new MapProperties();
        mapProperties.setLaneId(expectedLaneId);
        assertEquals(expectedLaneId, mapProperties.getLaneId());
    }

    @Test
    public void testEgressApproach() {
        Integer expectedEgressApproach = 1;
        MapProperties mapProperties = new MapProperties();
        mapProperties.setEgressApproach(expectedEgressApproach);
        assertEquals(expectedEgressApproach, mapProperties.getEgressApproach());
    }

    @Test
    public void testIngressApproach() {
        Integer expectedIngressApproach = 1;
        MapProperties mapProperties = new MapProperties();
        mapProperties.setIngressApproach(expectedIngressApproach);
        assertEquals(expectedIngressApproach, mapProperties.getIngressApproach());
    }

    @Test
    public void testIngressPath() {
        Boolean expectedIngressPath = true;
        MapProperties mapProperties = new MapProperties();
        mapProperties.setIngressPath(expectedIngressPath);
        assertEquals(expectedIngressPath, mapProperties.getIngressPath());
    }

    @Test
    public void testEgressPath() {
        Boolean expectedEgressPath = true;
        MapProperties mapProperties = new MapProperties();
        mapProperties.setEgressPath(expectedEgressPath);
        assertEquals(expectedEgressPath, mapProperties.getEgressPath());
    }
}
